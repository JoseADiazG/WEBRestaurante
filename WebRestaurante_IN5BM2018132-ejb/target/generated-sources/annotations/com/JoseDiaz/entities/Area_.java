package com.JoseDiaz.entities;

import com.JoseDiaz.entities.Mesas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:15:57")
@StaticMetamodel(Area.class)
public class Area_ { 

    public static volatile SingularAttribute<Area, String> descripcion;
    public static volatile SingularAttribute<Area, Mesas> idmesa;
    public static volatile SingularAttribute<Area, Integer> idarea;
    public static volatile ListAttribute<Area, Mesas> mesasList;

}