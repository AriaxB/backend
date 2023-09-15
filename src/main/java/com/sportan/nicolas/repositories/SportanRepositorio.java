package com.sportan.nicolas.repositories;

import com.sportan.nicolas.models.Usuarios;
import com.sportan.nicolas.models.Ordenes;
import com.sportan.nicolas.models.Producto;
import com.sportan.nicolas.models.Solicitudes;
import com.sportan.nicolas.models.Catalogo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SportanRepositorio {
    private final JdbcTemplate sql;
    @Autowired
    public SportanRepositorio(JdbcTemplate sql) {
        this.sql = sql;
    }
    // consultas clase usuarios
    public List<Usuarios> getUsuarios() {
        String query = "SELECT * FROM usuarios;";
        return sql.query(query, BeanPropertyRowMapper.newInstance(Usuarios.class));
    }

    public Usuarios onlyUser(int idUser) {
        String query = "SELECT * FROM usuarios WHERE id_usuario= ?";
        return sql.queryForObject(query, new Object[] { idUser }, BeanPropertyRowMapper.newInstance(Usuarios.class));
    }

    public boolean newUser(Usuarios u) {
        String query = "INSERT INTO usuarios(nombres_user,apellidos_user,correo,num_telefono,fecha_nacimiento,contraseña,cod_ciudad,cod_genero,id_rol,num_documento,direccion) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        sql.update(query, u.getNombresUser(), u.getApellidosUser(), u.getCorreo(), u.getNumTelefono(),
                u.getFechaNacimiento(), u.getContrasena(), u.getCodCiudad(), u.getCodGenero(), u.getIdRol(),
                u.getNumDocumento(), u.getDireccion());
        return true;
    }

    public boolean updateUser(Usuarios u, int idUser) {
        String query = "UPDATE usuarios SET nombres_user= ?, apellidos_user= ?, correo= ?, num_telefono= ?, fecha_nacimiento= ?, contraseña= ?,cod_ciudad=? WHERE id_usuario= ?";
        sql.update(query, u.getNombresUser(), u.getApellidosUser(), u.getCorreo(), u.getNumTelefono(),
                u.getFechaNacimiento(), u.getContrasena(), u.getCodCiudad(), idUser);
        return true;
    }

    public boolean deleteUser(int idUser) {
        String query = "DELETE FROM usuarios WHERE id_usuario= ? ";
        sql.update(query, idUser);
        return true;
    }

    // consultas clase catalogo
    public List<Catalogo> getCatalogo() {
        String query = "SELECT * FROM catalogo;";
        return sql.query(query, BeanPropertyRowMapper.newInstance(Catalogo.class));
    }

    public Catalogo getCatProd(int idCat) {
        String query = "SELECT * FROM catalogo INNER JOIN producto ON catalogo.id_catalogo=producto.id_catalogo WHERE id_catalogo= ?";
        return sql.queryForObject(query, new Object[] { idCat }, BeanPropertyRowMapper.newInstance(Catalogo.class));
    }

    // consultas clase producto
    public List<Producto> getProductos() {
        String query = "SELECT * FROM productos;";
        return sql.query(query, BeanPropertyRowMapper.newInstance(Producto.class));
    }

    public Producto onlyProd(int idProd) {
        String query = "SELECT * FROM producto WHERE id_producto= ?";
        return sql.queryForObject(query, new Object[] { idProd }, BeanPropertyRowMapper.newInstance(Producto.class));
    }

    public boolean newProducto(Producto p) {
        String query = "INSERT INTO usuarios(nombre_producto,descripcion_producto,precio_unitario,id_estado_producto,doc_vendedor,id_catalogo,cantidad_producto) VALUES(?, ?, ?, ?, ?, ?, ?)";
        sql.update(query, p.getNombreProducto(), p.getDescripcion(), p.getPrecioProducto(), p.getEstadoProducto(),
                p.getDocVendedor(), p.getIdCatalogo(), p.getCantidadProducto());
        return true;
    }

    public boolean updateProd(Producto p, int idProd) {
        String query = "UPDATE producto SET nombre_producto= ?, descripcion_producto= ?, precio_unitario= ?, id_estado_producto= ?, id_catalogo= ?,cantidad_producto=? WHERE id_usuario= ?";
        sql.update(query, p.getNombreProducto(), p.getDescripcion(), p.getPrecioProducto(), p.getEstadoProducto(),
                p.getCantidadProducto(), p.getIdCatalogo(), idProd);
        return true;
    }

    public boolean deleteProd(int idProd) {
        String query = "DELETE FROM producto WHERE id_producto= ? ";
        sql.update(query, idProd);
        return true;
    }

    // consultas clase ordenes de pedido
    public List<Ordenes> getorden() {
        String query = "SELECT * FROM orden_pedido;";
        return sql.query(query, BeanPropertyRowMapper.newInstance(Ordenes.class));
    }

    public boolean neworden(Ordenes o) {
        String query = "INSERT INTO orden_pedido(precio_total,cantidad_producto,doc_vendedor,doc_comprador,id_producto,id_tipo_pago,descripcion_orden) VALUES(?, ?, ?, ?, ?, ?, ?)";
        sql.update(query, o.getPrecioTotal(), o.getCantidadProducto(), o.getDocVendedor(), o.getDocComprador(),
                o.getIdProducto(), o.getIdTipoPago(), o.getDescripcionOrden());
        return true;
    }

    public boolean updateOrden(Ordenes o, int idOrden) {
        String query = "UPDATE orden_pedido SET precio_total= ?,cantidad_producto= ?,doc_vendedor= ?,doc_comprador= ?,id_producto= ?,id_tipo_pago= ?,descripcion_orden= ? WHERE id_orden=?";
        sql.update(query, o.getPrecioTotal(), o.getCantidadProducto(), o.getDocVendedor(), o.getDocComprador(),
                o.getIdProducto(), o.getIdTipoPago(), o.getDescripcionOrden(), idOrden);
        return true;
    }

    public boolean deleteOrden(int idOrden) {
        String query = "DELETE FROM orden_pedido WHERE id_orden= ? ";
        sql.update(query, idOrden);
        return true;
    }

    // consultas clase solicitudes
    public List<Solicitudes> getSolicitud() {
        String query = "SELECT * FROM solicitudes;";
        return sql.query(query, BeanPropertyRowMapper.newInstance(Solicitudes.class));
    }

    public boolean newSolicitud(Solicitudes s) {
        String query = "INSERT INTO solicitudes(nombre_persona,correo,cod_tipo_user,id_tipo_solicitud,descripcion_solicitud,id_estado_solicitud) VALUES(?, ?, ?, ?, ?, ?, ?)";
        sql.update(query, s.getNombrePersona(), s.getCorreo(), s.getCodTipoUser(), s.getIdTipoSolicitud(),
                s.getDescripcionSolicitud(), s.getIdEstadoSolicitud());
        return true;
    }

    public boolean updateSolicitud(Solicitudes s, int idSoli) {
        String query = "UPDATE solicitud SET respuesta= ? WHERE id_orden=?";
        sql.update(query, s.getRespuesta(), idSoli);
        return true;
    }

    public boolean deleteSolicitud(int idOrden) {
        String query = "DELETE FROM solicitudes WHERE id_solicitud= ? ";
        sql.update(query, idOrden);
        return true;
    }
}
