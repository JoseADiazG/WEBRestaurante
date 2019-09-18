package com.JoseDiaz.entities;

import com.JoseDiaz.entities.Detallefactura;
import com.JoseDiaz.entities.Horarios;
import com.JoseDiaz.entities.Platos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:15:57")
@StaticMetamodel(Cocineros.class)
public class Cocineros_ { 

    public static volatile SingularAttribute<Cocineros, String> apellidos;
    public static volatile ListAttribute<Cocineros, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Cocineros, Platos> idplatos;
    public static volatile SingularAttribute<Cocineros, Integer> idcocineros;
    public static volatile SingularAttribute<Cocineros, Horarios> idhorario;
    public static volatile SingularAttribute<Cocineros, String> telefono;
    public static volatile SingularAttribute<Cocineros, String> nombres;

}