package com.JoseDiaz.entities;

import com.JoseDiaz.entities.Clientes;
import com.JoseDiaz.entities.Mesas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:15:57")
@StaticMetamodel(Reservacion.class)
public class Reservacion_ { 

    public static volatile SingularAttribute<Reservacion, Mesas> idmesa;
    public static volatile SingularAttribute<Reservacion, Date> horareservacion;
    public static volatile SingularAttribute<Reservacion, Clientes> idclientes;
    public static volatile SingularAttribute<Reservacion, Integer> idreservacion;
    public static volatile SingularAttribute<Reservacion, String> personas;

}