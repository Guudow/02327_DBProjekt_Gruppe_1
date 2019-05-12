package PantherPharma.Bruger;

public class IBrugerDTOImpl implements IBrugerDTO {

    private int brugerId;
    private String brugerNavn;
    private int rolleId;
    private String rolleNavn;

    @Override
    public int getBrugerId() {
        return brugerId;
    }

    @Override
    public void setBrugerId(int brugerId) {
        this.brugerId = brugerId;
    }

    @Override
    public String getBrugerNavn() {
        return brugerNavn;
    }

    @Override
    public void setBrugerNavn(String brugerNavn) {
        this.brugerNavn = brugerNavn;
    }

    @Override
    public int getRolleId() {
        return rolleId;
    }

    @Override
    public void setRolleId(int rolleId) {
        this.rolleId = rolleId;
    }

    @Override
    public String getRolleNavn() {
        return rolleNavn;
    }

    @Override
    public void setRolleNavn(String rolleNavn) {
        this.rolleNavn = rolleNavn;
    }
}
