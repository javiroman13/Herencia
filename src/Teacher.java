public class Teacher extends Person {

    public Teacher(String name, String lastname, int edad, String email, String adress){

        super(name,lastname,edad,email,adress);
    }

    public void soy(){
        System.out.println("soy maestro");
    }
    public String toString(){
        System.out.println("maestro");
        System.out.println("nombre: "+getName());
        System.out.println("apellido: "+getLastname());
        System.out.println("edad: "+getEdad());
        System.out.println("direccion: "+getAdress());
        System.out.println("email: "+getEmail());
        return null;
    }

}
