package ec.edu.ups.ppw64.demo64.business;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import ec.edu.ups.ppw64.demo64.dao.FacturaDAO;
import ec.edu.ups.ppw64.demo64.dao.ProductoDAO;
import ec.edu.ups.ppw64.demo64.model.CabecerasFacturas;
import ec.edu.ups.ppw64.demo64.model.Carrito;
import ec.edu.ups.ppw64.demo64.model.DetalleFacturas;
import ec.edu.ups.ppw64.demo64.model.Producto;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionFacturas {

	@Inject
	private FacturaDAO daoFactura;
	
	@Inject
	private ProductoDAO daoProducto;
	
	public void actualizarFactura(CabecerasFacturas factura) throws Exception {
		CabecerasFacturas cli = daoFactura.read(factura.getCodigo());
		if (cli != null){
			daoFactura.update(factura);
		}else {
			throw new Exception("Factura no existe");
		}
	}
	
	public void guardarFacturas(Carrito carrito) {
		System.out.println("este es el carrito" + carrito);
		CabecerasFacturas fac = new CabecerasFacturas();
		fac.setUsuario(carrito.getUsuario());
		fac.setFecha(new Date());
		System.out.println("La fecha es: " + fac.getFecha() + " El string de la fecha es: " + fac.getFecha().toString() + "fsdf" + new Date());
		for(int i = 0; i < carrito.getDetalles().size(); i++) {
			System.out.println("Entro a meter detalles");
			DetalleFacturas det  = new DetalleFacturas();
			det.setCantidad(carrito.getDetalles().get(i).getCantidad());
			Producto pro = daoProducto.read(carrito.getDetalles().get(i).getProducto().getCodigo());
			det.setProductos(pro);
			det.setPrecioSubTotal((float) (pro.getPrecio() * carrito.getDetalles().get(i).getCantidad()));
			det.setPrecioIva((det.getPrecioSubTotal() * (12)) / 100);		
			det.setPrecioTotal(det.getPrecioIva() + det.getPrecioSubTotal());
			
			fac.setPrecioSubtotal(fac.getPrecioSubtotal()+det.getPrecioSubTotal());
			fac.setPrecioIva(fac.getPrecioIva()+det.getPrecioIva());
			fac.setPrecioTotal(fac.getPrecioTotal()+det.getPrecioTotal());
			
			fac.addDetalles(det);
		}
		
		daoFactura.insert(fac);
	}
	
	public void borrarFactura(int codigo) {
		daoFactura.remove(codigo);
	}
	
	public List<CabecerasFacturas> getFacturas(){
		return daoFactura.getAll();
	}
	
	public List<CabecerasFacturas> getFacturasPorCodigo(int codigo) {
		return daoFactura.getFacturasPorCodigoUsuario(codigo);
	}
	
}
