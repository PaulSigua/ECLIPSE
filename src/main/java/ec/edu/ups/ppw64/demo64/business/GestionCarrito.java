package ec.edu.ups.ppw64.demo64.business;

import java.util.List;

import ec.edu.ups.ppw64.demo64.dao.CarritoDAO;
import ec.edu.ups.ppw64.demo64.dao.DetalleCarritoDAO;
import ec.edu.ups.ppw64.demo64.dao.ProductoDAO;
import ec.edu.ups.ppw64.demo64.dao.UsuarioDAO;
import ec.edu.ups.ppw64.demo64.model.Carrito;
import ec.edu.ups.ppw64.demo64.model.DetalleCarrito;
import ec.edu.ups.ppw64.demo64.model.Producto;
import ec.edu.ups.ppw64.demo64.model.Usuario;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionCarrito {

	@Inject
	private CarritoDAO daoCarrito;

	@Inject
	private ProductoDAO daoProducto;

	@Inject
	private DetalleCarritoDAO daoDetalleCarrito;

	@Inject
	private UsuarioDAO daoUsuario;

	public void guardarCarrito(Carrito Carrito) {
		Carrito car = daoCarrito.read(Carrito.getCodigo());
		if (car != null) {
			daoCarrito.update(Carrito);
		} else {
			daoCarrito.insert(Carrito);
		}
	}

	public Carrito getClientePorCliente(int codigo) {
		return daoCarrito.getCarritoPorCliente(codigo);
	}

	public void actualizarCarrito(Carrito Carrito) throws Exception {
		Carrito car = daoCarrito.read(Carrito.getCodigo());
		if (car != null) {
			daoCarrito.update(Carrito);
		} else {
			throw new Exception("Cliente no existe");
		}
	}

	public void borrarCarrito(int codigo) {

		daoCarrito.remove(codigo);
	}

	public List<Carrito> getCarritos() {
		return daoCarrito.getAll();
	}

	public List<Integer> getCodigoCarrito() {
		return daoCarrito.getCodigoCarrito();
	}

	public List<DetalleCarrito> getDetallesCarrito() {
		return daoCarrito.getAllDetalles();
	}

	public Carrito crearCarritoParaUsuario(int usuarioId) {
		Usuario usuario = daoUsuario.read(usuarioId);
		if (usuario != null && usuario.getCarrito() == null) {
			Carrito nuevoCarrito = new Carrito();
			DetalleCarrito det = new DetalleCarrito();
			daoCarrito.insert(nuevoCarrito);

			usuario.setCarrito(nuevoCarrito);
			daoUsuario.update(usuario);

			nuevoCarrito.setUsuario(usuario);
			daoCarrito.update(nuevoCarrito);

			System.out.println("Carrito creado para usuario: " + usuarioId);
			return nuevoCarrito;
		}

		return null;
	}

	public Carrito getCarritoPorId(int codigo) {
		return daoCarrito.getCarritoPorId(codigo);
	}

	public void limpiarDetalles(int codigoCarrito) throws Exception {
		Carrito carObtenido = getCarritoPorId(codigoCarrito);
		List<DetalleCarrito> detallesExistentes = carObtenido.getDetalles();
		boolean encontroProducto = false;
		if (detallesExistentes.size() == 0) {
			System.out.println("Si entra aqui es por que esta mal");
		} else {
			carObtenido.getDetalles().clear();
			daoCarrito.update(carObtenido);
		}

	}

}
