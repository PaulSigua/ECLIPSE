package ec.edu.ups.ppw64.demo64.services;

import java.util.List;

import ec.edu.ups.ppw64.demo64.business.GestionCarrito;
import ec.edu.ups.ppw64.demo64.business.GestionFacturas;
import ec.edu.ups.ppw64.demo64.model.CabecerasFacturas;
import ec.edu.ups.ppw64.demo64.model.Carrito;
import ec.edu.ups.ppw64.demo64.model.Info;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("facturas")
public class FacturaServices {
	
	@Inject
	private GestionFacturas gFacturas;

	@Inject
	private GestionCarrito gCarrito;
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("guardar")
	public Response crear(Info info) {
		try{
			System.out.println("+++++++++++++"+ info.getCodigo_fac());
			Carrito carrito = gCarrito.getCarritoPorCliente(info.getCodigo_fac());
			gFacturas.guardarFacturas(carrito);
			ErrorMessage error = new ErrorMessage(1, "C logro");
			return Response.status(Response.Status.CREATED)
					.entity(error)
					.build();
		}catch (Exception e) {
			// TODO: handle exception
			ErrorMessage error = new ErrorMessage(99, e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(error)
					.build();
		}
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actualizar(CabecerasFacturas factura) {
		try{
			gFacturas.actualizarFactura(factura);
			return Response.ok(factura).build();
		}catch (Exception e) {
			// TODO: handle exception
			ErrorMessage error = new ErrorMessage(99, e.getMessage());
			return Response.status(Response.Status.NOT_FOUND)
					.entity(error)
					.build();
		}
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public Response borrar(@QueryParam("id") int codigo) {
		try{
			gFacturas.borrarFactura(codigo);
			ErrorMessage error = new ErrorMessage(1, "OK");
			//return Response.ok(Factura).build();
			return Response.status(Response.Status.CREATED).entity(error).build();
		}catch (Exception e) {
			// TODO: handle exception
			ErrorMessage error = new ErrorMessage(99, e.getMessage());
			return Response.status(Response.Status.NOT_FOUND)
					.entity(error)
					.build();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("list")
	public Response getFacturas(){
		List<CabecerasFacturas> factura = gFacturas.getFacturas();
		if(factura.size()>0)
			return Response.ok(factura).build();
		
		ErrorMessage error = new ErrorMessage(6, "No se registran Facturas");
		return Response.status(Response.Status.NOT_FOUND)
				.entity(error)
				.build();
		
	}
	
	@GET
	@Path("listPorUsuario/{codigoUsuario}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getFacturasPorCodigoUsuario(@PathParam("codigoUsuario") int codigoUsuario) {
	    List<CabecerasFacturas> facturas = gFacturas.getFacturasPorCodigo(codigoUsuario);
	    if (!facturas.isEmpty()) {
	        return Response.ok(facturas).build();
	    } else {
	        ErrorMessage error = new ErrorMessage(6, "No se registran Facturas para el usuario con código: " + codigoUsuario);
	        return Response.status(Response.Status.NOT_FOUND).entity(error).build();
	    }
	}

}
