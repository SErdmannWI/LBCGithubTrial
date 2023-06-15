import java.util.ArrayList;
import java.util.UUID;

public class TestAI {
    private String name;
    private UUID uuid;
    private String personality;
    private ArrayList<String> proficientSkills;

    public TestAI() {
        this.name = "Test AI";
        this.uuid = UUID.randomUUID();
        this.personality = "Boring";
        this.proficientSkills = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public ArrayList<String> getProficientSkills() {
        return proficientSkills;
    }

    public void setProficientSkills(ArrayList<String> proficientSkills) {
        this.proficientSkills = proficientSkills;
    }
}
