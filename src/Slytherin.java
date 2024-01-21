import java.util.Objects;

public class Slytherin extends Hogwarts{
    //слизерин
    private Integer cunning; //хитрость
    private Integer determination; //решительность
    private Integer ambition; //амбициозность
    private Integer resourcefulness; //находчивость
    private Integer thirstForPower; //жажда власти

    public Slytherin(String fullName,
                     Integer thePowerOfMagic,
                     Integer transgression,
                     Integer cunning,
                     Integer determination,
                     Integer ambition,
                     Integer resourcefulness,
                     Integer thirstForPower) {
        super(fullName, thePowerOfMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public Integer getCunning() {return cunning;}
    public Integer getDetermination() {return determination;}
    public Integer getAmbition() {return ambition;}
    public Integer getResourcefulness() {return resourcefulness;}
    public Integer getThirstForPower() {return thirstForPower;}

}
