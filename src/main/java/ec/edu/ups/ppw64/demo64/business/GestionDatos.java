package ec.edu.ups.ppw64.demo64.business;

import java.util.List;

import ec.edu.ups.ppw64.demo64.dao.CarritoDAO;
import ec.edu.ups.ppw64.demo64.dao.CategoriaDAO;
import ec.edu.ups.ppw64.demo64.dao.UsuarioDAO;
import ec.edu.ups.ppw64.demo64.dao.MensajeUsuarioDAO;
import ec.edu.ups.ppw64.demo64.dao.ProductoDAO;
import ec.edu.ups.ppw64.demo64.model.Carrito;
import ec.edu.ups.ppw64.demo64.model.Categoria;
import ec.edu.ups.ppw64.demo64.model.Usuario;
import ec.edu.ups.ppw64.demo64.model.MensajesUsuarios;
import ec.edu.ups.ppw64.demo64.model.Producto;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class GestionDatos {

	@Inject
	private UsuarioDAO daoCuenta;

	@Inject
	private MensajeUsuarioDAO daoMsjUsuario;
	
	@Inject
	private CategoriaDAO daoCategoria;
	
	@Inject
	private ProductoDAO daoProducto;
	
	@Inject 
	private CarritoDAO daoCarrito;

	@PostConstruct
	public void init() {
		System.out.println("iniciando");
		Categoria cat1 = new Categoria();
		cat1.setNombre("ropa");
		
		Categoria cat2 = new Categoria();
		cat2.setNombre("tecnologia");
		
		Categoria cat3 = new Categoria();
		cat3.setNombre("hogar");
		
		Categoria cat4 = new Categoria();
		cat4.setNombre("gaming");
		
		Categoria cat5 = new Categoria();
		cat5.setNombre("electrodomesticos");
		
		Categoria cat6 = new Categoria();
		cat6.setNombre("construccion");
		
		////////////////////////////////////////
		
		Producto pro1 = new Producto();
		pro1.setNombre("Zapatos Vans Classic");
		pro1.setPrecio(89.99f);
		pro1.setCaracteristicas("Los mejores zapatos en la actualidad. Los clásicos de clásicos.");
		pro1.setImagen("https://i.pinimg.com/564x/06/a7/a9/06a7a95fb792ce3dfd55b792547cb76a.jpg");
		pro1.setCategoria(cat1);
		pro1.setDescripcionGeneral("Unos zapatos clásicos que combinan estilo y comodidad.");

		Producto pro2 = new Producto();
		pro2.setNombre("Camiseta Adidas Originals");
		pro2.setPrecio((float) 45.99);
		pro2.setCaracteristicas("Camiseta de alta calidad");
		pro2.setImagen("https://i.pinimg.com/564x/ab/12/6c/ab126cf24aac31cae98e82c7fdcc4015.jpg");
		pro2.setCategoria(cat1);
		pro2.setDescripcionGeneral("Camiseta para cualquier ocasión");

		Producto pro3 = new Producto();
		pro3.setNombre("Jeans Levi's 501");
		pro3.setPrecio((float) 99.99);
		pro3.setCaracteristicas("Jeans clásicos y duraderos");
		pro3.setImagen("https://i.pinimg.com/564x/8a/3f/f9/8a3ff9a5246125222cf9c8b7cd5e735b.jpg");
		pro3.setCategoria(cat1);
		pro3.setDescripcionGeneral("Jeans de la marca líder en calidad");

		Producto pro4 = new Producto();
		pro4.setNombre("Vestido de noche elegante");
		pro4.setPrecio((float) 129.99);
		pro4.setCaracteristicas("Vestido de noche para ocasiones especiales");
		pro4.setImagen("https://i.pinimg.com/564x/6b/d8/72/6bd87291a7438995bd336c932769fdcc.jpg");
		pro4.setCategoria(cat1);
		pro4.setDescripcionGeneral("Diseño elegante y moderno");

		Producto pro5 = new Producto();
		pro5.setNombre("Sudadera con capucha Nike");
		pro5.setPrecio((float) 59.99);
		pro5.setCaracteristicas("Sudadera cómoda y deportiva");
		pro5.setImagen("https://i.pinimg.com/564x/5e/dd/aa/5eddaa9e8b5d91a3c2b5c55c5c0a9121.jpg");
		pro5.setCategoria(cat1);
		pro5.setDescripcionGeneral("Perfecta para el uso diario");

		Producto pro6 = new Producto();
		pro6.setNombre("Falda plisada");
		pro6.setPrecio((float) 34.99);
		pro6.setCaracteristicas("Falda elegante y femenina");
		pro6.setImagen("https://i.pinimg.com/564x/33/87/c2/3387c21387a84d41e68c27da20992fc6.jpg");
		pro6.setCategoria(cat1);
		pro6.setDescripcionGeneral("Estilo clásico y versátil");

		Producto pro7 = new Producto();
		pro7.setNombre("Camisa de vestir blanca");
		pro7.setPrecio((float) 39.99);
		pro7.setCaracteristicas("Camisa formal para ocasiones especiales");
		pro7.setImagen("https://i.pinimg.com/564x/fe/57/98/fe57984bb431b9d9f2615297214a5ce4.jpg");
		pro7.setCategoria(cat1);
		pro7.setDescripcionGeneral("Elegante y cómoda");

		Producto pro8 = new Producto();
		pro8.setNombre("Jersey de lana");
		pro8.setPrecio((float) 79.99);
		pro8.setCaracteristicas("Jersey de lana suave y abrigado");
		pro8.setImagen("https://i.pinimg.com/564x/73/d8/b9/73d8b9321602ebbe8e809e13799a4a04.jpg");
		pro8.setCategoria(cat1);
		pro8.setDescripcionGeneral("Ideal para los días fríos");

		Producto pro9 = new Producto();
		pro9.setNombre("Chaqueta vaquera");
		pro9.setPrecio((float) 69.99);
		pro9.setCaracteristicas("Chaqueta vaquera moderna y cómoda");
		pro9.setImagen("https://i.pinimg.com/564x/88/d7/eb/88d7eb3bef38cfa007ab7a83111e7ce4.jpg");
		pro9.setCategoria(cat1);
		pro9.setDescripcionGeneral("Estilo casual para cualquier ocasión");

		Producto pro10 = new Producto();
		pro10.setNombre("Traje elegante para hombre");
		pro10.setPrecio((float) 199.99);
		pro10.setCaracteristicas("Traje formal para eventos especiales");
		pro10.setImagen("https://i.pinimg.com/564x/9b/70/ca/9b70caf93644c9a6b494defe46850a08.jpg");
		pro10.setCategoria(cat1);
		pro10.setDescripcionGeneral("Confeccionado con materiales de alta calidad");

		Producto pro11 = new Producto();
		pro11.setNombre("Polo Lacoste");
		pro11.setPrecio((float) 59.99);
		pro11.setCaracteristicas("Polo clásico y elegante");
		pro11.setImagen("https://i.pinimg.com/564x/72/cd/1d/72cd1d8557540989823528fa5e53cd01.jpg");
		pro11.setCategoria(cat1);
		pro11.setDescripcionGeneral("Marca reconocida por su calidad");

		Producto pro12 = new Producto();
		pro12.setNombre("Pantalones cortos deportivos");
		pro12.setPrecio((float) 29.99);
		pro12.setCaracteristicas("Pantalones cortos ideales para el gimnasio");
		pro12.setImagen("https://i.pinimg.com/564x/28/2a/97/282a97e5a8879b0c16099acd0ef03415.jpg");
		pro12.setCategoria(cat1);
		pro12.setDescripcionGeneral("Comodidad y estilo para entrenar");

		Producto pro13 = new Producto();
		pro13.setNombre("Vestido veraniego estampado");
		pro13.setPrecio((float) 49.99);
		pro13.setCaracteristicas("Vestido fresco y ligero para el verano");
		pro13.setImagen("https://i.pinimg.com/564x/96/b3/0d/96b30d3f56a3d5349f8caf9dcf297a15.jpg");
		pro13.setCategoria(cat1);
		pro13.setDescripcionGeneral("Diseño moderno y juvenil");

		Producto pro14 = new Producto();
		pro14.setNombre("Calcetines divertidos");
		pro14.setPrecio((float) 9.99);
		pro14.setCaracteristicas("Calcetines con diseños coloridos y originales");
		pro14.setImagen("https://i.pinimg.com/564x/3c/5c/98/3c5c98abe592f809b45ad868ecdbddb3.jpg");
		pro14.setCategoria(cat1);
		pro14.setDescripcionGeneral("Añade un toque de diversión a tu estilo");

		Producto pro15 = new Producto();
		pro15.setNombre("Gorra de béisbol");
		pro15.setPrecio((float) 19.99);
		pro15.setCaracteristicas("Gorra clásica para protegerse del sol");
		pro15.setImagen("https://i.pinimg.com/564x/70/ce/34/70ce348c804fc87efaa3bb03693f375c.jpg");
		pro15.setCategoria(cat1);
		pro15.setDescripcionGeneral("Estilo deportivo para cualquier ocasión");

		
		
		
		Producto pro16 = new Producto();
		pro16.setNombre("Monitor LG UltraGear 27GL850-B");
		pro16.setPrecio((float) 449.99);
		pro16.setCaracteristicas("Monitor gaming IPS con resolución QHD y tasa de refresco de 144Hz");
		pro16.setImagen("https://i.pinimg.com/564x/27/4e/22/274e2288542411de0451761bf4885e31.jpg");
		pro16.setCategoria(cat2);
		pro16.setDescripcionGeneral("Colores vibrantes y respuesta rápida para una experiencia de juego suave");

		Producto pro17 = new Producto();
		pro17.setNombre("Teclado mecánico Razer BlackWidow Elite");
		pro17.setPrecio((float) 169.99);
		pro17.setCaracteristicas("Teclado para gaming con interruptores mecánicos Razer y retroiluminación RGB");
		pro17.setImagen("https://i.pinimg.com/564x/1a/ad/ca/1aadcafd3119dd01476515d087a0239a.jpg");
		pro17.setCategoria(cat2);
		pro17.setDescripcionGeneral("Personalización avanzada y rendimiento superior para jugadores");

		Producto pro18 = new Producto();
		pro18.setNombre("Mouse Logitech G502 HERO");
		pro18.setPrecio((float) 79.99);
		pro18.setCaracteristicas("Ratón gaming con sensor HERO 25K y 11 botones programables");
		pro18.setImagen("https://i.pinimg.com/564x/da/87/76/da8776b9d77361d34cd36f75a24bb21f.jpg");
		pro18.setCategoria(cat2);
		pro18.setDescripcionGeneral("Precisión y comodidad para largas sesiones de juego");

		Producto pro19 = new Producto();
		pro19.setNombre("Auriculares con cancelación de ruido Bose QuietComfort 35 II");
		pro19.setPrecio((float) 299.99);
		pro19.setCaracteristicas("Auriculares inalámbricos con tecnología de cancelación de ruido ajustable");
		pro19.setImagen("https://i.pinimg.com/564x/7e/f9/8e/7ef98e9bef2a40247276b663163f5da4.jpg");
		pro19.setCategoria(cat2);
		pro19.setDescripcionGeneral("Sumérgete en tu música con tranquilidad en cualquier entorno");

		Producto pro20 = new Producto();
		pro20.setNombre("Router Mesh Google Nest Wifi");
		pro20.setPrecio((float) 249.99);
		pro20.setCaracteristicas("Sistema de router y puntos de acceso para una cobertura Wi-Fi amplia y estable");
		pro20.setImagen("https://i.pinimg.com/564x/a7/66/99/a766997c6f76c22c09e8c5868ae6498d.jpg");
		pro20.setCategoria(cat2);
		pro20.setDescripcionGeneral("Wi-Fi rápido y confiable en todo tu hogar");

		Producto pro21 = new Producto();
		pro21.setNombre("Teclado inalámbrico Apple Magic Keyboard");
		pro21.setPrecio((float) 99.99);
		pro21.setCaracteristicas("Teclado delgado y ergonómico con conexión Bluetooth");
		pro21.setImagen("https://i.pinimg.com/564x/8e/67/8e/8e678edd40f828cab4de854d9dc46fb8.jpg");
		pro21.setCategoria(cat2);
		pro21.setDescripcionGeneral("Diseñado para una experiencia de escritura cómoda y eficiente");

		Producto pro22 = new Producto();
		pro22.setNombre("Disco duro externo WD Elements 2TB");
		pro22.setPrecio((float) 79.99);
		pro22.setCaracteristicas("Almacenamiento portátil de alta capacidad y velocidad de transferencia");
		pro22.setImagen("https://i.pinimg.com/564x/6b/ad/14/6bad148481a28943b59dee387d7261cd.jpg");
		pro22.setCategoria(cat2);
		pro22.setDescripcionGeneral("Respaldos de datos rápidos y seguros en un dispositivo compacto");

		Producto pro23 = new Producto();
		pro23.setNombre("Kit de inicio Philips Hue White & Color Ambiance");
		pro23.setPrecio((float) 199.99);
		pro23.setCaracteristicas("Kit de iluminación inteligente con bombillas LED ajustables y puente Hue");
		pro23.setImagen("https://i.pinimg.com/564x/f7/e7/f0/f7e7f030966d980c9744edf961460441.jpg");
		pro23.setCategoria(cat2);
		pro23.setDescripcionGeneral("Controla la iluminación de tu hogar desde tu smartphone");

		Producto pro24 = new Producto();
		pro24.setNombre("Monitor Samsung Odyssey G7");
		pro24.setPrecio((float) 649.99);
		pro24.setCaracteristicas("Monitor gaming curvo de 27 pulgadas con resolución QHD y tasa de refresco de 240Hz");
		pro24.setImagen("https://i.pinimg.com/564x/a7/77/40/a77740d4d5215e9cb01e42a07bfa541d.jpg");
		pro24.setCategoria(cat2);
		pro24.setDescripcionGeneral("Inmersión total en tus juegos favoritos con imágenes fluidas y vibrantes");

		Producto pro25 = new Producto();
		pro25.setNombre("Cámara de acción GoPro HERO9 Black");
		pro25.setPrecio((float) 449.99);
		pro25.setCaracteristicas("Cámara resistente al agua con grabación de video 5K y fotos de 20MP");
		pro25.setImagen("https://i.pinimg.com/564x/54/3a/fb/543afb1c7105159dbe6410d199d4a36b.jpg");
		pro25.setCategoria(cat2);
		pro25.setDescripcionGeneral("Captura tus aventuras con detalles impresionantes y estabilidad de nivel profesional");

		Producto pro26 = new Producto();
		pro26.setNombre("Laptop Apple MacBook Pro 13");
		pro26.setPrecio((float) 1299.99);
		pro26.setCaracteristicas("Portátil potente con chip M1 de Apple y pantalla Retina");
		pro26.setImagen("https://i.pinimg.com/564x/1e/ff/5b/1eff5ba29d0df9215cd6f152b405835c.jpg");
		pro26.setCategoria(cat2);
		pro26.setDescripcionGeneral("Rendimiento excepcional y duración de la batería para profesionales creativos");

		Producto pro27 = new Producto();
		pro27.setNombre("Impresora fotográfica Canon SELPHY CP1300");
		pro27.setPrecio((float) 99.99);
		pro27.setCaracteristicas("Impresora compacta para fotos con conexión Wi-Fi y pantalla LCD inclinable");
		pro27.setImagen("https://i.pinimg.com/564x/86/6a/dd/866add79e46cb5aaf88d4839d5799006.jpg");
		pro27.setCategoria(cat2);
		pro27.setDescripcionGeneral("Imprime tus recuerdos favoritos desde tu smartphone o cámara");

		Producto pro28 = new Producto();
		pro28.setNombre("Tablet Samsung Galaxy Tab S7+");
		pro28.setPrecio((float) 849.99);
		pro28.setCaracteristicas("Tableta con pantalla Super AMOLED de 12.4 pulgadas y S Pen incluido");
		pro28.setImagen("https://i.pinimg.com/564x/83/bc/a3/83bca3f3da086542ccc5fdd17f303692.jpg");
		pro28.setCategoria(cat2);
		pro28.setDescripcionGeneral("Productividad y entretenimiento en una pantalla espectacularmente inmersiva");

		Producto pro29 = new Producto();
		pro29.setNombre("Altavoz inteligente Amazon Echo Dot (4ta generación)");
		pro29.setPrecio((float) 49.99);
		pro29.setCaracteristicas("Altavoz con Alexa integrada para control de voz y reproducción de música");
		pro29.setImagen("https://i.pinimg.com/564x/a5/31/08/a531087bbde291bdd2191ab4d5856c32.jpg");
		pro29.setCategoria(cat2);
		pro29.setDescripcionGeneral("Escucha música, obtén información y controla dispositivos inteligentes con facilidad");

		Producto pro30 = new Producto();
		pro30.setNombre("Monitor gaming ASUS ROG Swift PG279Q");
		pro30.setPrecio((float) 599.99);
		pro30.setCaracteristicas("Monitor de 27 pulgadas con resolución WQHD y tasa de refresco de 165Hz");
		pro30.setImagen("https://i.pinimg.com/564x/f3/cd/46/f3cd461b9cf188aba6edd618d0a6af95.jpg");
		pro30.setCategoria(cat2);
		pro30.setDescripcionGeneral("Experiencia de juego suave y sin cortes con tecnología G-SYNC");
		
		
		
//////////////////////////////////////////////////////////////
		
		Producto pro31 = new Producto();
		pro31.setNombre("Robot aspirador iRobot Roomba 960");
		pro31.setPrecio((float) 499.99);
		pro31.setCaracteristicas("Robot aspirador con mapeo inteligente y navegación vSLAM");
		pro31.setImagen("https://i.pinimg.com/564x/0f/7e/66/0f7e667d311ea4e9d945ac8aa4c56e01.jpg");
		pro31.setCategoria(cat3);
		pro31.setDescripcionGeneral("Limpieza eficiente y programable para mantener tu hogar impecable");

		Producto pro32 = new Producto();
		pro32.setNombre("Sofá seccional L-shaped");
		pro32.setPrecio((float) 899.99);
		pro32.setCaracteristicas("Sofá modular con chaise longue y tapicería de tela resistente");
		pro32.setImagen("https://i.pinimg.com/564x/eb/c0/76/ebc07645c4a40f193013d95dfc178182.jpg");
		pro32.setCategoria(cat3);
		pro32.setDescripcionGeneral("Comodidad y estilo para tu sala de estar con un diseño versátil");

		Producto pro33 = new Producto();
		pro33.setNombre("Set de sábanas de algodón orgánico");
		pro33.setPrecio((float) 59.99);
		pro33.setCaracteristicas("Juego de sábanas suaves y transpirables para cama queen");
		pro33.setImagen("https://i.pinimg.com/564x/96/44/3c/96443cad364600b9722baeea9726837c.jpg");
		pro33.setCategoria(cat3);
		pro33.setDescripcionGeneral("Descansa mejor con sábanas de calidad y respetuosas con el medio ambiente");

		Producto pro34 = new Producto();
		pro34.setNombre("Espejo de pared decorativo");
		pro34.setPrecio((float) 79.99);
		pro34.setCaracteristicas("Espejo con marco de madera rústica para decorar cualquier espacio");
		pro34.setImagen("https://i.pinimg.com/564x/2b/9d/c6/2b9dc6d661e75e1c26922bc2d04af894.jpg");
		pro34.setCategoria(cat3);
		pro34.setDescripcionGeneral("Amplía visualmente tu habitación y añade estilo con este elegante espejo");

		Producto pro35 = new Producto();
		pro35.setNombre("Mesa de centro de vidrio y metal");
		pro35.setPrecio((float) 149.99);
		pro35.setCaracteristicas("Mesa moderna con tapa de vidrio templado y patas de metal negro");
		pro35.setImagen("https://i.pinimg.com/564x/a1/21/6a/a1216a6b606de3641c0f1112d9d60ed4.jpg");
		pro35.setCategoria(cat3);
		pro35.setDescripcionGeneral("Añade un toque de elegancia a tu sala de estar con esta mesa versátil");

		Producto pro36 = new Producto();
		pro36.setNombre("Set de cuchillos de cocina");
		pro36.setPrecio((float) 49.99);
		pro36.setCaracteristicas("Juego de cuchillos de acero inoxidable con soporte de madera");
		pro36.setImagen("https://i.pinimg.com/564x/be/01/34/be0134d7c6cb3c706458028dee68ec2d.jpg");
		pro36.setCategoria(cat3);
		pro36.setDescripcionGeneral("Herramientas esenciales para preparar tus comidas con precisión y estilo");

		Producto pro37 = new Producto();
		pro37.setNombre("Organizador de zapatos colgante");
		pro37.setPrecio((float) 29.99);
		pro37.setCaracteristicas("Rack de almacenamiento para colgar sobre la puerta del armario");
		pro37.setImagen("https://i.pinimg.com/564x/8b/f9/f5/8bf9f5d5d9f56468efe5d49090e9aad1.jpg");
		pro37.setCategoria(cat3);
		pro37.setDescripcionGeneral("Maximiza el espacio en tu armario y organiza tus zapatos de manera eficiente");

		Producto pro38 = new Producto();
		pro38.setNombre("Lámpara de pie moderna");
		pro38.setPrecio((float) 79.99);
		pro38.setCaracteristicas("Lámpara de suelo con pantalla de tela y base de metal");
		pro38.setImagen("https://i.pinimg.com/564x/2c/46/34/2c4634d9d1bbf15c73121b085258c7d1.jpg");
		pro38.setCategoria(cat3);
		pro38.setDescripcionGeneral("Iluminación ambiental y elegante para cualquier rincón de tu hogar");

		Producto pro39 = new Producto();
		pro39.setNombre("Alfombra de área de sisal");
		pro39.setPrecio((float) 99.99);
		pro39.setCaracteristicas("Tapete tejido a mano con fibra natural de sisal y bordes de algodón");
		pro39.setImagen("https://i.pinimg.com/564x/b8/8b/06/b88b06f43ae6809292db452d41e24d8b.jpg");
		pro39.setCategoria(cat3);
		pro39.setDescripcionGeneral("Añade calidez y textura a tus espacios con esta alfombra resistente");

		Producto pro40 = new Producto();
		pro40.setNombre("Juego de toallas de baño de lujo");
		pro40.setPrecio((float) 39.99);
		pro40.setCaracteristicas("Toallas de algodón egipcio de alta calidad y absorción");
		pro40.setImagen("https://i.pinimg.com/564x/65/b5/c8/65b5c80ec51e0a0d3c15c42f359568db.jpg");
		pro40.setCategoria(cat3);
		pro40.setDescripcionGeneral("Envuélvete en suavidad y confort después de cada baño");

		Producto pro41 = new Producto();
		pro41.setNombre("Silla ergonómica de oficina");
		pro41.setPrecio((float) 199.99);
		pro41.setCaracteristicas("Silla giratoria con respaldo ajustable y soporte lumbar");
		pro41.setImagen("https://i.pinimg.com/564x/8c/80/4a/8c804a5f4df14ab4752783ee04526639.jpg");
		pro41.setCategoria(cat3);
		pro41.setDescripcionGeneral("Comodidad y apoyo para largas horas de trabajo en casa");

		Producto pro42 = new Producto();
		pro42.setNombre("Caja organizadora de juguetes");
		pro42.setPrecio((float) 34.99);
		pro42.setCaracteristicas("Baúl de almacenamiento plegable con diseño de animales");
		pro42.setImagen("https://i.pinimg.com/564x/70/0d/4e/700d4e8b02128b65ca128c0bf65613df.jpg");
		pro42.setCategoria(cat3);
		pro42.setDescripcionGeneral("Mantén ordenados los juguetes de tus niños con esta caja divertida");

		Producto pro43 = new Producto();
		pro43.setNombre("Cojines decorativos para el sofá");
		pro43.setPrecio((float) 24.99);
		pro43.setCaracteristicas("Set de cojines cuadrados con fundas de lino y estampados variados");
		pro43.setImagen("https://i.pinimg.com/564x/86/b2/9d/86b29de4a45af8f099100500cbb12963.jpg");
		pro43.setCategoria(cat3);
		pro43.setDescripcionGeneral("Añade color y estilo a tu sala de estar con estos cojines decorativos");

		Producto pro44 = new Producto();
		pro44.setNombre("Perchero de pie con estante");
		pro44.setPrecio((float) 49.99);
		pro44.setCaracteristicas("Organizador de entrada con ganchos y estante para zapatos");
		pro44.setImagen("https://i.pinimg.com/564x/5f/44/0c/5f440c1343f82ec915ff795bdf06adc3.jpg");
		pro44.setCategoria(cat3);
		pro44.setDescripcionGeneral("Mantén tu entrada ordenada y acogedora con este práctico perchero");

		Producto pro45 = new Producto();
		pro45.setNombre("Juego de ollas y sartenes antiadherentes");
		pro45.setPrecio((float) 129.99);
		pro45.setCaracteristicas("Set de cocina de 10 piezas con revestimiento cerámico y mangos ergonómicos");
		pro45.setImagen("https://i.pinimg.com/564x/14/8e/13/148e13c4650cbe1140ac03d7bfafe0e3.jpg");
		pro45.setCategoria(cat3);
		pro45.setDescripcionGeneral("Prepara tus platos favoritos con la mejor calidad y facilidad de limpieza");

		///////////////////////////////////////////////////////////
		
		
		
		Producto pro46 = new Producto();
		pro46.setNombre("Consola de videojuegos PlayStation 5");
		pro46.setPrecio((float) 499.99);
		pro46.setCaracteristicas("Última generación de consola de Sony con gráficos de alta definición");
		pro46.setImagen("https://i.pinimg.com/564x/cd/43/67/cd43672a63f6356bd4199d4ae6d1d480.jpg");
		pro46.setCategoria(cat4);
		pro46.setDescripcionGeneral("Disfruta de la mejor experiencia de juego con la nueva PlayStation 5");

		Producto pro47 = new Producto();
		pro47.setNombre("Silla gaming ergonómica");
		pro47.setPrecio((float) 249.99);
		pro47.setCaracteristicas("Silla ajustable con soporte lumbar y reposabrazos acolchados");
		pro47.setImagen("https://i.pinimg.com/564x/08/1b/6d/081b6d684a88d9e2317099a87f54caf5.jpg");
		pro47.setCategoria(cat4);
		pro47.setDescripcionGeneral("Comodidad y estilo para largas sesiones de juego con esta silla gaming");

		Producto pro48 = new Producto();
		pro48.setNombre("Teclado mecánico para gaming");
		pro48.setPrecio((float) 99.99);
		pro48.setCaracteristicas("Teclado retroiluminado con interruptores mecánicos y teclas programables");
		pro48.setImagen("https://i.pinimg.com/736x/d6/02/c4/d602c4e3717cb364b906efee8f2a6f35.jpg");
		pro48.setCategoria(cat4);
		pro48.setDescripcionGeneral("Respuesta rápida y precisión para tus partidas más intensas con este teclado");

		Producto pro49 = new Producto();
		pro49.setNombre("Mouse gaming con sensor óptico");
		pro49.setPrecio((float) 79.99);
		pro49.setCaracteristicas("Mouse ergonómico con botones programables y diseño de alta precisión");
		pro49.setImagen("https://i.pinimg.com/564x/21/24/d3/2124d3acb251d0db5bde462dc520640d.jpg");
		pro49.setCategoria(cat4);
		pro49.setDescripcionGeneral("Domina el campo de batalla con este mouse diseñado para jugadores exigentes");

		Producto pro50 = new Producto();
		pro50.setNombre("Auriculares inalámbricos para gaming");
		pro50.setPrecio((float) 129.99);
		pro50.setCaracteristicas("Auriculares con sonido envolvente 7.1 y micrófono con cancelación de ruido");
		pro50.setImagen("https://i.pinimg.com/564x/27/d2/5b/27d25b0298361a0a38f7e1aeb4ddd4ea.jpg");
		pro50.setCategoria(cat4);
		pro50.setDescripcionGeneral("Sumérgete en el mundo del juego con una calidad de audio excepcional");

		Producto pro51 = new Producto();
		pro51.setNombre("Monitor gaming curvo de 27 pulgadas");
		pro51.setPrecio((float) 399.99);
		pro51.setCaracteristicas("Pantalla QLED con tasa de refresco de 144Hz y tecnología HDR");
		pro51.setImagen("https://i.pinimg.com/564x/3d/22/65/3d2265f718e91227c3eeed94129fbc0a.jpg");
		pro51.setCategoria(cat4);
		pro51.setDescripcionGeneral("Experimenta la acción en toda su magnitud con este monitor curvo");

		Producto pro52 = new Producto();
		pro52.setNombre("Volante y pedales para simulación de carreras");
		pro52.setPrecio((float) 299.99);
		pro52.setCaracteristicas("Sistema de volante con force feedback y pedales ajustables");
		pro52.setImagen("https://i.pinimg.com/736x/58/0a/7c/580a7c1a87d6d24f81d1ffa5c49e18a9.jpg");
		pro52.setCategoria(cat4);
		pro52.setDescripcionGeneral("Siente la emoción de la pista en casa con este volante de simulación");

		Producto pro53 = new Producto();
		pro53.setNombre("Mesa de escritorio gamer");
		pro53.setPrecio((float) 179.99);
		pro53.setCaracteristicas("Mesa con superficie amplia, soporte para monitor y organizador de cables");
		pro53.setImagen("https://i.pinimg.com/564x/fd/fd/9f/fdfd9f7c3702ae19c815d4eaace0dcd5.jpg");
		pro53.setCategoria(cat4);
		pro53.setDescripcionGeneral("Diseñada para jugadores, esta mesa ofrece espacio y funcionalidad");

		Producto pro54 = new Producto();
		pro54.setNombre("Alfombrilla para mouse gaming");
		pro54.setPrecio((float) 19.99);
		pro54.setCaracteristicas("Superficie de tela con base antideslizante y bordes reforzados");
		pro54.setImagen("https://i.pinimg.com/564x/45/78/c3/4578c3c603f26da33089a8b4c7d8c265.jpg");
		pro54.setCategoria(cat4);
		pro54.setDescripcionGeneral("Mejora la precisión de tu mouse con esta alfombrilla diseñada para juegos");

		Producto pro55 = new Producto();
		pro55.setNombre("Mochila para laptop gamer");
		pro55.setPrecio((float) 49.99);
		pro55.setCaracteristicas("Mochila resistente al agua con compartimentos acolchados para portátil y accesorios");
		pro55.setImagen("https://i.pinimg.com/564x/1c/97/d7/1c97d7944f498f490c711f83d3bd738f.jpg");
		pro55.setCategoria(cat4);
		pro55.setDescripcionGeneral("Protege tu equipo y transporta tus dispositivos con comodidad");

		Producto pro56 = new Producto();
		pro56.setNombre("Silla de juego para niños");
		pro56.setPrecio((float) 99.99);
		pro56.setCaracteristicas("Silla ergonómica ajustable con diseño colorido y respaldo reclinable");
		pro56.setImagen("https://i.pinimg.com/564x/b2/a2/38/b2a2387836e054bbe4b8bfbed10e13ab.jpg");
		pro56.setCategoria(cat4);
		pro56.setDescripcionGeneral("Comodidad y diversión para los pequeños gamers con esta silla especial");

		Producto pro57 = new Producto();
		pro57.setNombre("Tarjeta gráfica NVIDIA GeForce RTX 3080");
		pro57.setPrecio((float) 699.99);
		pro57.setCaracteristicas("Potente tarjeta gráfica con arquitectura Ampere para juegos de alta gama");
		pro57.setImagen("https://i.pinimg.com/564x/6b/1b/79/6b1b79204f77ddc0b02492a26e4fd555.jpg");
		pro57.setCategoria(cat4);
		pro57.setDescripcionGeneral("Experimenta el rendimiento extremo en tus juegos favoritos con esta tarjeta");

		Producto pro58 = new Producto();
		pro58.setNombre("Auriculares gaming con micrófono retráctil");
		pro58.setPrecio((float) 59.99);
		pro58.setCaracteristicas("Auriculares estéreo con sonido envolvente y control de volumen integrado");
		pro58.setImagen("https://i.pinimg.com/564x/2d/77/ab/2d77ab2cbc72241eed827b997ca82037.jpg");
		pro58.setCategoria(cat4);
		pro58.setDescripcionGeneral("Comunicación clara y sonido de alta calidad para tus partidas");

		Producto pro59 = new Producto();
		pro59.setNombre("Mousepad RGB para gaming");
		pro59.setPrecio((float) 39.99);
		pro59.setCaracteristicas("Superficie suave con iluminación LED personalizable y base antideslizante");
		pro59.setImagen("https://i.pinimg.com/564x/2c/d9/3d/2cd93d4812b69f7bad977e072d70978e.jpg");
		pro59.setCategoria(cat4);
		pro59.setDescripcionGeneral("Añade un toque de estilo y funcionalidad a tu escritorio con este mousepad");

		Producto pro60 = new Producto();
		pro60.setNombre("Silla gamer con masajeador lumbar");
		pro60.setPrecio((float) 349.99);
		pro60.setCaracteristicas("Silla ajustable con función de masaje, reposapiés retráctil y reposabrazos 4D");
		pro60.setImagen("https://i.pinimg.com/564x/03/25/36/032536d38ac6fc623755f49be9d839e0.jpg");
		pro60.setCategoria(cat4);
		pro60.setDescripcionGeneral("Combina comodidad y relajación con esta silla gaming de última generación");

		
		//////////////////////////////////////
		
		Producto pro61 = new Producto();
		pro61.setNombre("Refrigerador de acero inoxidable");
		pro61.setPrecio((float) 999.99);
		pro61.setCaracteristicas("Refrigerador de dos puertas con dispensador de agua y capacidad de 20 pies cúbicos");
		pro61.setImagen("https://i.pinimg.com/736x/0f/27/0f/0f270f1acb6bea03a2d6182e1d2f7974.jpg");
		pro61.setCategoria(cat5);
		pro61.setDescripcionGeneral("Mantén tus alimentos frescos y organizados con este refrigerador de alta calidad");

		Producto pro62 = new Producto();
		pro62.setNombre("Lavadora de carga frontal");
		pro62.setPrecio((float) 699.99);
		pro62.setCaracteristicas("Lavadora de ropa con capacidad para 8 kg y tecnología de lavado eficiente");
		pro62.setImagen("https://i.pinimg.com/564x/28/22/19/2822192066fe2661705690acb3064f74.jpg");
		pro62.setCategoria(cat5);
		pro62.setDescripcionGeneral("Lava tu ropa de manera eficiente y delicada con esta lavadora de última generación");

		Producto pro63 = new Producto();
		pro63.setNombre("Licuadora de alta potencia");
		pro63.setPrecio((float) 79.99);
		pro63.setCaracteristicas("Licuadora de 1000W con jarra de vidrio resistente y cuchillas de acero inoxidable");
		pro63.setImagen("https://i.pinimg.com/736x/8b/c9/51/8bc95102ee9cfb526a48623123669ba1.jpg");
		pro63.setCategoria(cat5);
		pro63.setDescripcionGeneral("Prepara tus batidos y bebidas favoritas con facilidad gracias a esta licuadora potente");

		Producto pro64 = new Producto();
		pro64.setNombre("Cafetera programable de goteo");
		pro64.setPrecio((float) 49.99);
		pro64.setCaracteristicas("Cafetera con temporizador programable, jarra térmica y capacidad de 10 tazas");
		pro64.setImagen("https://i.pinimg.com/564x/dd/28/79/dd2879aae133cf1997d6f1313929e377.jpg");
		pro64.setCategoria(cat5);
		pro64.setDescripcionGeneral("Despiértate con el aroma del café recién hecho con esta cafetera programable");

		Producto pro65 = new Producto();
		pro65.setNombre("Aspiradora sin bolsa");
		pro65.setPrecio((float) 129.99);
		pro65.setCaracteristicas("Aspiradora con tecnología ciclónica y filtro HEPA para una limpieza eficiente");
		pro65.setImagen("https://i.pinimg.com/564x/33/01/18/33011846d825540697145a9e20afc13e.jpg");
		pro65.setCategoria(cat5);
		pro65.setDescripcionGeneral("Mantén tu hogar impecable con esta potente y versátil aspiradora sin bolsa");

		Producto pro66 = new Producto();
		pro66.setNombre("Freidora de aire digital");
		pro66.setPrecio((float) 89.99);
		pro66.setCaracteristicas("Freidora sin aceite con capacidad de 5.8 cuartos y pantalla táctil LCD");
		pro66.setImagen("https://i.pinimg.com/736x/d4/74/3d/d4743d1fa7c82e4164c91d83677b83dc.jpg");
		pro66.setCategoria(cat5);
		pro66.setDescripcionGeneral("Disfruta de alimentos crujientes y saludables con esta freidora de aire");

		Producto pro67 = new Producto();
		pro67.setNombre("Plancha de vapor vertical");
		pro67.setPrecio((float) 59.99);
		pro67.setCaracteristicas("Plancha portátil con tanque de agua extraíble y vapor continuo");
		pro67.setImagen("https://i.pinimg.com/564x/2d/c5/2a/2dc52a4eb718b16865d7dc3d804dab77.jpg");
		pro67.setCategoria(cat5);
		pro67.setDescripcionGeneral("Elimina las arrugas de tus prendas de manera rápida y eficiente con esta plancha");

		Producto pro68 = new Producto();
		pro68.setNombre("Horno eléctrico de convección");
		pro68.setPrecio((float) 149.99);
		pro68.setCaracteristicas("Horno multifuncional con capacidad de 30 litros y función de horneado por convección");
		pro68.setImagen("https://i.pinimg.com/564x/ed/84/04/ed8404f7c82a4d478065f60b7cc5d527.jpg");
		pro68.setCategoria(cat5);
		pro68.setDescripcionGeneral("Cocina deliciosos platos con mayor rapidez y eficiencia con este horno eléctrico");

		Producto pro69 = new Producto();
		pro69.setNombre("Robot aspirador inteligente");
		pro69.setPrecio((float) 249.99);
		pro69.setCaracteristicas("Robot aspirador con navegación láser, mapeo inteligente y control remoto");
		pro69.setImagen("https://i.pinimg.com/564x/8c/86/04/8c860472b08eb1b8fa4d77e7530c1c0f.jpg");
		pro69.setCategoria(cat5);
		pro69.setDescripcionGeneral("Mantén tu hogar limpio sin esfuerzo con este robot aspirador autónomo");

		Producto pro70 = new Producto();
		pro70.setNombre("Exprimidor eléctrico de cítricos");
		pro70.setPrecio((float) 39.99);
		pro70.setCaracteristicas("Exprimidor con motor de alta potencia y sistema antigoteo");
		pro70.setImagen("https://i.pinimg.com/564x/c0/16/65/c01665f64c8048c786a6b105670fc40a.jpg");
		pro70.setCategoria(cat5);
		pro70.setDescripcionGeneral("Disfruta de jugos frescos y deliciosos con este exprimidor eléctrico");

		Producto pro71 = new Producto();
		pro71.setNombre("Secadora de ropa eléctrica");
		pro71.setPrecio((float) 349.99);
		pro71.setCaracteristicas("Secadora de ropa de carga frontal con múltiples programas y sensor de humedad");
		pro71.setImagen("https://i.pinimg.com/564x/ff/83/7d/ff837d393c5592fe48335ff2989c9182.jpg");
		pro71.setCategoria(cat5);
		pro71.setDescripcionGeneral("Mantén tu ropa seca y suave en todo momento con esta secadora eléctrica");

		Producto pro72 = new Producto();
		pro72.setNombre("Plancha de cocina eléctrica");
		pro72.setPrecio((float) 79.99);
		pro72.setCaracteristicas("Plancha eléctrica con superficie antiadherente y termostato regulable");
		pro72.setImagen("https://i.pinimg.com/564x/a9/54/88/a95488fdab81a12f26117916f618c1ec.jpg");
		pro72.setCategoria(cat5);
		pro72.setDescripcionGeneral("Prepara deliciosas comidas a la plancha con esta práctica y versátil herramienta");

		Producto pro73 = new Producto();
		pro73.setNombre("Batidora de pedestal con bowl");
		pro73.setPrecio((float) 69.99);
		pro73.setCaracteristicas("Batidora de 6 velocidades con accesorios intercambiables y tazón de acero inoxidable");
		pro73.setImagen("https://i.pinimg.com/564x/d6/ed/b1/d6edb1e76e0affc9adc7b17c2902b434.jpg");
		pro73.setCategoria(cat5);
		pro73.setDescripcionGeneral("Prepara masas, cremas y mucho más con esta batidora versátil y potente");

		Producto pro74 = new Producto();
		pro74.setNombre("Hervidor eléctrico de agua");
		pro74.setPrecio((float) 29.99);
		pro74.setCaracteristicas("Hervidor con capacidad de 1.7 litros y apagado automático");
		pro74.setImagen("https://i.pinimg.com/736x/25/bd/d4/25bdd4c42eaeed5ed424516a3c14788b.jpg");
		pro74.setCategoria(cat5);
		pro74.setDescripcionGeneral("Prepara tus infusiones y bebidas calientes de manera rápida y segura");

		Producto pro75 = new Producto();
		pro75.setNombre("Ventilador de torre oscilante");
		pro75.setPrecio((float) 59.99);
		pro75.setCaracteristicas("Ventilador con función de oscilación, temporizador y control remoto");
		pro75.setImagen("https://i.pinimg.com/736x/23/74/f7/2374f7a4cc625825fd2b0515284da59b.jpg");
		pro75.setCategoria(cat5);
		pro75.setDescripcionGeneral("Mantén tu hogar fresco y confortable en los días calurosos con este ventilador");

		//////////////////////////////////////////////
		
		
		Producto pro76 = new Producto();
		pro76.setNombre("Taladro inalámbrico de impacto");
		pro76.setPrecio((float) 129.99);
		pro76.setCaracteristicas("Taladro de 20V con función de percusión, luz LED y portabrocas sin llave");
		pro76.setImagen("https://i.pinimg.com/564x/9a/a1/3e/9aa13e9aad78f6dce0fd7fdafcd7a81f.jpg");
		pro76.setCategoria(cat6);
		pro76.setDescripcionGeneral("Realiza perforaciones precisas y potentes con este taladro inalámbrico");

		Producto pro77 = new Producto();
		pro77.setNombre("Sierra circular eléctrica");
		pro77.setPrecio((float) 99.99);
		pro77.setCaracteristicas("Sierra circular con guía láser, hoja de carburo y ajuste de profundidad");
		pro77.setImagen("https://i.pinimg.com/564x/1e/0b/31/1e0b31d851179aaeb41a4d9312ff113f.jpg");
		pro77.setCategoria(cat6);
		pro77.setDescripcionGeneral("Corta madera y otros materiales con precisión y facilidad con esta sierra eléctrica");

		Producto pro78 = new Producto();
		pro78.setNombre("Martillo percutor profesional");
		pro78.setPrecio((float) 39.99);
		pro78.setCaracteristicas("Martillo de 16 oz con cabeza de acero forjado y mango ergonómico");
		pro78.setImagen("https://i.pinimg.com/564x/55/c4/0d/55c40d4d26f80da44fe2f692df210ef1.jpg");
		pro78.setCategoria(cat6);
		pro78.setDescripcionGeneral("Realiza trabajos de demolición y construcción con este martillo resistente y duradero");

		Producto pro79 = new Producto();
		pro79.setNombre("Nivel láser autonivelante");
		pro79.setPrecio((float) 79.99);
		pro79.setCaracteristicas("Nivel láser con trípode, función de autonivelación y alcance de 30 metros");
		pro79.setImagen("https://i.pinimg.com/564x/15/3b/97/153b9751e503741b73824779fdf3c624.jpg");
		pro79.setCategoria(cat6);
		pro79.setDescripcionGeneral("Realiza mediciones precisas y alineaciones perfectas con este nivel láser");

		Producto pro80 = new Producto();
		pro80.setNombre("Compresor de aire portátil");
		pro80.setPrecio((float) 89.99);
		pro80.setCaracteristicas("Compresor de 150 PSI con indicador de presión, manguera y accesorios incluidos");
		pro80.setImagen("https://i.pinimg.com/564x/6d/27/e3/6d27e3fe027fd8988c2bc4cdcc2f8135.jpg");
		pro80.setCategoria(cat6);
		pro80.setDescripcionGeneral("Infla neumáticos, herramientas y más con este compresor de aire compacto");

		Producto pro81 = new Producto();
		pro81.setNombre("Juego de llaves de vaso y carraca");
		pro81.setPrecio((float) 49.99);
		pro81.setCaracteristicas("Set de 40 piezas con llaves de vaso métricas, carraca reversible y estuche organizador");
		pro81.setImagen("https://i.pinimg.com/564x/4d/40/a1/4d40a1383e8636a1cab305bfe452c160.jpg");
		pro81.setCategoria(cat6);
		pro81.setDescripcionGeneral("Realiza reparaciones y mantenimiento con facilidad gracias a este completo juego de llaves");

		Producto pro82 = new Producto();
		pro82.setNombre("Escalera telescópica de aluminio");
		pro82.setPrecio((float) 129.99);
		pro82.setCaracteristicas("Escalera extensible de 12.5 pies con capacidad de carga de hasta 330 libras");
		pro82.setImagen("https://i.pinimg.com/564x/ab/a6/b8/aba6b885830c43dea0a62a1c47d60643.jpg");
		pro82.setCategoria(cat6);
		pro82.setDescripcionGeneral("Accede a lugares altos de manera segura y práctica con esta escalera telescópica");

		Producto pro83 = new Producto();
		pro83.setNombre("Cinta métrica retráctil");
		pro83.setPrecio((float) 14.99);
		pro83.setCaracteristicas("Cinta métrica de 25 pies con carcasa resistente y bloqueo automático");
		pro83.setImagen("https://i.pinimg.com/564x/9d/74/5b/9d745b86cd5b028c51d40a834865db68.jpg");
		pro83.setCategoria(cat6);
		pro83.setDescripcionGeneral("Realiza mediciones precisas en tus proyectos de construcción con esta cinta métrica");

		Producto pro84 = new Producto();
		pro84.setNombre("Atornillador eléctrico recargable");
		pro84.setPrecio((float) 34.99);
		pro84.setCaracteristicas("Atornillador con batería de litio, luz LED y reversible");
		pro84.setImagen("https://i.pinimg.com/564x/d2/95/ff/d295fff8e92fdea0e0af3f5ae5ba06db.jpg");
		pro84.setCategoria(cat6);
		pro84.setDescripcionGeneral("Ahorra tiempo y esfuerzo en tus proyectos de bricolaje con este atornillador eléctrico");

		Producto pro85 = new Producto();
		pro85.setNombre("Sierra ingletadora con mesa");
		pro85.setPrecio((float) 199.99);
		pro85.setCaracteristicas("Sierra de corte en ángulo con mesa extensible y sistema de sujeción");
		pro85.setImagen("https://i.pinimg.com/564x/17/09/b9/1709b941f56b4e6aa5114aaa522ca087.jpg");
		pro85.setCategoria(cat6);
		pro85.setDescripcionGeneral("Realiza cortes precisos y angulares en tus proyectos de carpintería con esta sierra");

		Producto pro86 = new Producto();
		pro86.setNombre("Generador eléctrico portátil");
		pro86.setPrecio((float) 499.99);
		pro86.setCaracteristicas("Generador con motor de 4 tiempos, capacidad de 4000 vatios y salida USB");
		pro86.setImagen("https://i.pinimg.com/564x/15/55/d5/1555d5a1e0d937313fe7f4d3a7e115dc.jpg");
		pro86.setCategoria(cat6);
		pro86.setDescripcionGeneral("Obtén energía portátil en cualquier lugar con este generador eléctrico");

		Producto pro87 = new Producto();
		pro87.setNombre("Zapatos Converse All Star");
		pro87.setPrecio((float) 90.00);
		pro87.setCaracteristicas("Los clasicos jamás pasan de moda, más comodos que nunca!!!!");
		pro87.setImagen("https://i.pinimg.com/564x/71/e0/6a/71e06affe9952eb328c9962a7ddf03c8.jpg");
		pro87.setCategoria(cat1);
		pro87.setDescripcionGeneral("Los nuevos Zapatos Converse presentan una mejora en la planta del pie, mejor pisada, "
				+ "mejor agarre y lo más importante es que son aún más comodos");
		
		Producto pro88 = new Producto();
		pro88.setNombre("Zapatos Converse All Star Rojos Caña alta");
		pro88.setPrecio((float) 94.99);
		pro88.setCaracteristicas("Los clásicos han vuelto mejor que nunca");
		pro88.setImagen("https://i.pinimg.com/564x/cf/97/9c/cf979cd31c1243290d784925e8b23bfa.jpg");
		pro88.setCategoria(cat1);
		pro88.setDescripcionGeneral("Los nuevos Zapatos Converse Caña alta se caracterizan por una mejor suela, mejor agarre, y lo más importante es que son aún más comodos");
		
		Producto pro89 = new Producto();
		pro89.setNombre("Zapatos Vans BiColor Negro y Azul");
		pro89.setPrecio((float) 94.99);
		pro89.setCaracteristicas("Vans se caracteriza por innovar");
		pro89.setImagen("https://i.pinimg.com/564x/a1/19/5c/a1195c7b1aa788d3436d7e4772d24bcf.jpg");
		pro89.setCategoria(cat1);
		pro89.setDescripcionGeneral("Los nuevos Vans BiColor son perfectos. Disponibles para cualquier situación con más comodidad");
		
		
		daoProducto.insert(pro1);
		daoProducto.insert(pro2);
		daoProducto.insert(pro3);
		daoProducto.insert(pro4);
		daoProducto.insert(pro5);
		daoProducto.insert(pro6);
		daoProducto.insert(pro7);
		daoProducto.insert(pro8);
		daoProducto.insert(pro9);
		daoProducto.insert(pro10);
		daoProducto.insert(pro11);
		daoProducto.insert(pro12);
		daoProducto.insert(pro13);
		daoProducto.insert(pro14);
		daoProducto.insert(pro15);
		daoProducto.insert(pro16);
		daoProducto.insert(pro17);
		daoProducto.insert(pro18);
		daoProducto.insert(pro19);
		daoProducto.insert(pro20);
		daoProducto.insert(pro21);
		daoProducto.insert(pro22);
		daoProducto.insert(pro23);
		daoProducto.insert(pro24);
		daoProducto.insert(pro25);
		daoProducto.insert(pro26);
		daoProducto.insert(pro27);
		daoProducto.insert(pro28);
		daoProducto.insert(pro29);
		daoProducto.insert(pro30);
		daoProducto.insert(pro31);
		daoProducto.insert(pro32);
		daoProducto.insert(pro33);
		daoProducto.insert(pro34);
		daoProducto.insert(pro35);
		daoProducto.insert(pro36);
		daoProducto.insert(pro37);
		daoProducto.insert(pro38);
		daoProducto.insert(pro39);
		daoProducto.insert(pro40);
		daoProducto.insert(pro41);
		daoProducto.insert(pro42);
		daoProducto.insert(pro43);
		daoProducto.insert(pro44);
		daoProducto.insert(pro45);
		daoProducto.insert(pro46);
		daoProducto.insert(pro47);
		daoProducto.insert(pro48);
		daoProducto.insert(pro49);
		daoProducto.insert(pro50);
		daoProducto.insert(pro51);
		daoProducto.insert(pro52);
		daoProducto.insert(pro53);
		daoProducto.insert(pro54);
		daoProducto.insert(pro55);
		daoProducto.insert(pro56);
		daoProducto.insert(pro57);
		daoProducto.insert(pro58);
		daoProducto.insert(pro59);
		daoProducto.insert(pro60);
		daoProducto.insert(pro61);
		daoProducto.insert(pro62);
		daoProducto.insert(pro63);
		daoProducto.insert(pro64);
		daoProducto.insert(pro65);
		daoProducto.insert(pro66);
		daoProducto.insert(pro67);
		daoProducto.insert(pro68);
		daoProducto.insert(pro69);
		daoProducto.insert(pro70);
		daoProducto.insert(pro71);
		daoProducto.insert(pro72);
		daoProducto.insert(pro73);
		daoProducto.insert(pro74);
		daoProducto.insert(pro75);
		daoProducto.insert(pro76);
		daoProducto.insert(pro77);
		daoProducto.insert(pro78);
		daoProducto.insert(pro79);
		daoProducto.insert(pro80);
		daoProducto.insert(pro81);
		daoProducto.insert(pro82);
		daoProducto.insert(pro83);
		daoProducto.insert(pro84);
		daoProducto.insert(pro85);
		daoProducto.insert(pro86);
		daoProducto.insert(pro87);
		daoProducto.insert(pro88);
		daoProducto.insert(pro89);


		cat1.addProducto(pro1);
		cat1.addProducto(pro2);
		cat1.addProducto(pro3);
		cat1.addProducto(pro4);
		cat1.addProducto(pro5);
		cat1.addProducto(pro6);
		cat1.addProducto(pro7);
		cat1.addProducto(pro8);
		cat1.addProducto(pro9);
		cat1.addProducto(pro10);
		cat1.addProducto(pro11);
		cat1.addProducto(pro12);
		cat1.addProducto(pro13);
		cat1.addProducto(pro14);
		cat1.addProducto(pro15);
		cat1.addProducto(pro87);
		cat1.addProducto(pro88);
		cat1.addProducto(pro89);
		
		cat2.addProducto(pro16);
		cat2.addProducto(pro17);
		cat2.addProducto(pro18);
		cat2.addProducto(pro19);
		cat2.addProducto(pro20);
		cat2.addProducto(pro21);
		cat2.addProducto(pro22);
		cat2.addProducto(pro23);
		cat2.addProducto(pro24);
		cat2.addProducto(pro25);
		cat2.addProducto(pro26);
		cat2.addProducto(pro27);
		cat2.addProducto(pro28);
		cat2.addProducto(pro29);
		cat2.addProducto(pro30);
		
		
		cat3.addProducto(pro31);
		cat3.addProducto(pro32);
		cat3.addProducto(pro33);
		cat3.addProducto(pro34);
		cat3.addProducto(pro35);
		cat3.addProducto(pro36);
		cat3.addProducto(pro37);
		cat3.addProducto(pro38);
		cat3.addProducto(pro39);
		cat3.addProducto(pro40);
		cat3.addProducto(pro41);
		cat3.addProducto(pro42);
		cat3.addProducto(pro43);
		cat3.addProducto(pro44);
		cat3.addProducto(pro45);
		
		
		cat3.addProducto(pro46);
		cat3.addProducto(pro47);
		cat3.addProducto(pro48);
		cat3.addProducto(pro49);
		cat3.addProducto(pro50);
		cat3.addProducto(pro51);
		cat3.addProducto(pro52);
		cat3.addProducto(pro53);
		cat3.addProducto(pro54);
		cat3.addProducto(pro55);
		cat3.addProducto(pro56);
		cat3.addProducto(pro57);
		cat3.addProducto(pro58);
		cat3.addProducto(pro59);
		cat3.addProducto(pro60);
		
		cat3.addProducto(pro61);
		cat3.addProducto(pro62);
		cat3.addProducto(pro63);
		cat3.addProducto(pro64);
		cat3.addProducto(pro65);
		cat3.addProducto(pro66);
		cat3.addProducto(pro67);
		cat3.addProducto(pro68);
		cat3.addProducto(pro69);
		cat3.addProducto(pro70);
		cat3.addProducto(pro71);
		cat3.addProducto(pro72);
		cat3.addProducto(pro73);
		cat3.addProducto(pro74);
		cat3.addProducto(pro75);
		
		
		
		cat3.addProducto(pro76);
		cat3.addProducto(pro77);
		cat3.addProducto(pro78);
		cat3.addProducto(pro79);
		cat3.addProducto(pro80);
		cat3.addProducto(pro81);
		cat3.addProducto(pro82);
		cat3.addProducto(pro83);
		cat3.addProducto(pro84);
		cat3.addProducto(pro85);
		cat3.addProducto(pro86);

		
		daoCategoria.insert(cat1);
		daoCategoria.insert(cat2);
		daoCategoria.insert(cat3);
		daoCategoria.insert(cat4);
		daoCategoria.insert(cat5);
		daoCategoria.insert(cat6);
		System.out.println("\n------------- Cuentas");
		List<Usuario> list1 = daoCuenta.getAll();
		for (Usuario cue : list1) {
			System.out.println(cue);
		}
		
		System.out.println("\n------------- Categoria");
		List<Categoria> list2 = daoCategoria.getAll();
		for (Categoria cat : list2) {
			System.out.println(cat);
		}
		
		System.out.println("\n------------- Productos");
		List<Producto> list3 = daoProducto.getAll();
		for (Producto pro : list3) {
			System.out.println(pro);
		}
		
		System.out.println("\n------------- Carritos");
		List<Carrito> list4 = daoCarrito.getAll();
		for (Carrito carr : list4) {
			System.out.println(carr);
		}

	}
}