package com.JoseDiaz.entities;

import com.JoseDiaz.entities.Cocineros;
import com.JoseDiaz.entities.Detallefactura;
import com.JoseDiaz.entities.Facturas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:15:57")
@StaticMetamodel(Platos.class)
public class Platos_ { 

    public static volatile ListAttribute<Platos, Cocineros> cocinerosList;
    public static volatile SingularAttribute<Platos, String> precio;
    public static volatile SingularAttribute<Platos, String> postre;
    public static volatile SingularAttribute<Platos, String> aperitivo;
    public static volatile ListAttribute<Platos, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Platos, Integer> idplatos;
    public static volatile SingularAttribute<Platos, String> plato;
    public static volatile ListAttribute<Platos, Facturas> facturasList;
    public static volatile SingularAttribute<Platos, String> bebida;

}