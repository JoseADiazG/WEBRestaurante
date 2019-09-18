package com.JoseDiaz.entities;

import com.JoseDiaz.entities.Facturas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:15:57")
@StaticMetamodel(Pago.class)
public class Pago_ { 

    public static volatile SingularAttribute<Pago, String> descripcion;
    public static volatile SingularAttribute<Pago, Integer> idpago;
    public static volatile ListAttribute<Pago, Facturas> facturasList;

}