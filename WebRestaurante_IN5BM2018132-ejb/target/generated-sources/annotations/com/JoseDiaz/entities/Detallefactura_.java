package com.JoseDiaz.entities;

import com.JoseDiaz.entities.Cocineros;
import com.JoseDiaz.entities.Facturas;
import com.JoseDiaz.entities.Platos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:15:57")
@StaticMetamodel(Detallefactura.class)
public class Detallefactura_ { 

    public static volatile SingularAttribute<Detallefactura, Platos> idplatos;
    public static volatile SingularAttribute<Detallefactura, Cocineros> idcocineros;
    public static volatile SingularAttribute<Detallefactura, String> totalventa;
    public static volatile SingularAttribute<Detallefactura, Integer> iddetallefactura;
    public static volatile SingularAttribute<Detallefactura, String> totalpago;
    public static volatile SingularAttribute<Detallefactura, Facturas> idfactura;

}