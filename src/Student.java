public class Student extends Person{
    private long Controlnumber;
    public Student(String name, String lastname, int edad,long controlnumber, String email, String adress){
        super(name,lastname,edad,email,adress);
        this.Controlnumber=controlnumber;
    }

    public long getControlnumber() {
        return Controlnumber;
    }

    public void setControlnumber(long controlnumber) {
        Controlnumber = controlnumber;
    }


    public String toString(){
        System.out.println("alumno");
        System.out.println("nombre:"+getName());
        System.out.println("apellido:"+getLastname());
        System.out.println("edad:"+getEdad());
        System.out.println("numero de control:"+getControlnumber());
        System.out.println("correo electronico:"+getEmail());
        System.out.println("direccion:"+getAdress());
        return null;
    }
    public void Soy(){
        System.out.println("soy estudiante");

    }





}
