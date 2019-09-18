package com.JoseDiaz.entities;

import com.JoseDiaz.entities.Area;
import com.JoseDiaz.entities.Meseros;
import com.JoseDiaz.entities.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:15:57")
@StaticMetamodel(Mesas.class)
public class Mesas_ { 

    public static volatile SingularAttribute<Mesas, Integer> idmesas;
    public static volatile SingularAttribute<Mesas, Area> idarea;
    public static volatile ListAttribute<Mesas, Area> areaList;
    public static volatile SingularAttribute<Mesas, Meseros> idmeseros;
    public static volatile ListAttribute<Mesas, Reservacion> reservacionList;
    public static volatile ListAttribute<Mesas, Meseros> meserosList;

}