package com.JoseDiaz.entities;

import com.JoseDiaz.entities.Facturas;
import com.JoseDiaz.entities.Horarios;
import com.JoseDiaz.entities.Mesas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:15:57")
@StaticMetamodel(Meseros.class)
public class Meseros_ { 

    public static volatile SingularAttribute<Meseros, Mesas> idmesa;
    public static volatile SingularAttribute<Meseros, String> apellido;
    public static volatile SingularAttribute<Meseros, Integer> idmeseros;
    public static volatile SingularAttribute<Meseros, Horarios> idhorario;
    public static volatile SingularAttribute<Meseros, String> telefono;
    public static volatile SingularAttribute<Meseros, String> nombre;
    public static volatile ListAttribute<Meseros, Mesas> mesasList;
    public static volatile ListAttribute<Meseros, Facturas> facturasList;

}