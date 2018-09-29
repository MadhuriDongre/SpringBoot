# SpringBoot
Spring Boot Project using PostgreSQL 
This is a Spring Boot Application using maven as build tool and PostgreSQL as database.

Create/Insert Script for Table 'mytable'

  CREATE TABLE public.mytable
  (
      id integer NOT NULL DEFAULT nextval('"mytable_Id_seq"'::regclass),
      name character varying(200) COLLATE pg_catalog."default",
      email character varying(200) COLLATE pg_catalog."default",
      address character varying(200) COLLATE pg_catalog."default",
      city character varying(100) COLLATE pg_catalog."default",
      country character varying(50) COLLATE pg_catalog."default",
      CONSTRAINT mytable_pkey PRIMARY KEY (id)
  )
  WITH (
      OIDS = FALSE
  )
  TABLESPACE pg_default;

  ALTER TABLE public.mytable
      OWNER to postgres;

  COMMENT ON COLUMN public.mytable.id
      IS 'unique id';

    
You can run the application locally and test it on below URLs:
http://localhost:8080/  : Prints Hello World on UI
http://localhost:8080/print/  : Get method to show all data from the table
http://localhost:8080/print/{id} : Get method to show data from the table based on id
