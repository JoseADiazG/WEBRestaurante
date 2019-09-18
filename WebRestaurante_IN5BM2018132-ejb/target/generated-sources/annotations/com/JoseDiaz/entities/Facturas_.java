package com.JoseDiaz.entities;

import com.JoseDiaz.entities.Clientes;
import com.JoseDiaz.entities.Detallefactura;
import com.JoseDiaz.entities.Meseros;
import com.JoseDiaz.entities.Pago;
import com.JoseDiaz.entities.Platos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:15:57")
@StaticMetamodel(Facturas.class)
public class Facturas_ { 

    public static volatile SingularAttribute<Facturas, String> totalapagar;
    public static volatile ListAttribute<Facturas, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Facturas, Pago> idpago;
    public static volatile SingularAttribute<Facturas, Platos> idplatos;
    public static volatile SingularAttribute<Facturas, Clientes> idcliente;
    public static volatile SingularAttribute<Facturas, Meseros> idmesero;
    public static volatile SingularAttribute<Facturas, Integer> idfacturas;

}