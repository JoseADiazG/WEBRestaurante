package com.JoseDiaz.entities;

import com.JoseDiaz.entities.Cocineros;
import com.JoseDiaz.entities.Meseros;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-18T08:15:57")
@StaticMetamodel(Horarios.class)
public class Horarios_ { 

    public static volatile SingularAttribute<Horarios, Integer> idhorarios;
    public static volatile ListAttribute<Horarios, Cocineros> cocinerosList;
    public static volatile SingularAttribute<Horarios, Date> hora;
    public static volatile ListAttribute<Horarios, Meseros> meserosList;

}