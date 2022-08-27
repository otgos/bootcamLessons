package serialization;

import java.io.*;

public class SerializationDeserialization {
    public static void main(String[] args) throws IOException {
//        User user1 = new User(1L, "John Mak", "342-242-424");
//        User user2 = new User(2L, "Mike Nash", "234-00-2342");
//        User user3 = new User(3L, "Otgo Ajk", "754-423-1312");
//
//        try (FileOutputStream fos = new FileOutputStream("user.dat")){
//                try (ObjectOutputStream oos = new ObjectOutputStream(fos)){
//                        oos.writeObject(user1);
//                        oos.writeObject(user2);
//                        oos.writeObject(user3);
//
//
//                    } catch(IOException e){
//                        throw new RuntimeException(e);
//                    }
//                } catch (FileNotFoundException e) {
//                    throw new RuntimeException(e);
//                }

        readObject();
        }
        static void readObject(){
            try(FileInputStream fis = new FileInputStream("user.dat")){
                try (ObjectInputStream ois = new ObjectInputStream(fis)){

                    try{
                        User user1 = (User)ois.readObject();
                        User user2 = (User)ois.readObject();
                        User user3 = (User)ois.readObject();

                        System.out.println(user1.toString());
                        System.out.println(user2.toString());
                        System.out.println(user3.toString());

                    }catch (ClassNotFoundException e){
                        e.printStackTrace();
                    }


                }catch (IOException e){
                    e.printStackTrace();
                }
            }catch (FileNotFoundException e1){
                e1.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

class User implements Serializable{

    //serialVersionUID is used to ensure that during deserialization the same class is loaded
    private  static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private String ssn;

    public User(Long id, String name, String ssn) {
        this.id = id;
        this.name = name;
        this.ssn = ssn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
