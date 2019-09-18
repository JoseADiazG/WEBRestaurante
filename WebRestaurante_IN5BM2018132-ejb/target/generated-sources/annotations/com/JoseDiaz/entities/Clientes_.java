package com.JoseDiaz.entities;

import com.JoseDiaz.entities.Facturas;
import com.JoseDiaz.entities.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:15:57")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> apellidos;
    public static volatile SingularAttribute<Clientes, Integer> nit;
    public static volatile SingularAttribute<Clientes, Integer> idclientes;
    public static volatile SingularAttribute<Clientes, String> telefono;
    public static volatile SingularAttribute<Clientes, String> nombre;
    public static volatile ListAttribute<Clientes, Reservacion> reservacionList;
    public static volatile ListAttribute<Clientes, Facturas> facturasList;

}