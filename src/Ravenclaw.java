import java.util.Objects;

public class Ravenclaw extends Hogwarts{
    //когтевран
    private Integer mind; //ум
    private Integer wisdom; //мудрость
    private Integer wit; //остроумность
    private Integer creation; //творчество

    public Ravenclaw(String fullName,
                     Integer thePowerOfMagic,
                     Integer transgression,
                     Integer mind,
                     Integer wisdom,
                     Integer wit,
                     Integer creation) {
        super(fullName, thePowerOfMagic, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public Integer getMind() {return mind;}
    public Integer getWisdom() {return wisdom;}
    public Integer getWit() {return wit;}
    public Integer getCreation() {return creation;}
}
