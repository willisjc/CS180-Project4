public class Equipment {
    private String weapon;
    private String vehicle;

    public Equipment(String weapon, String vehicle) {
        if (weapon != null)
            this.weapon = weapon;
        if (vehicle != null)
            this.vehicle = vehicle;
    }


    public String getVehicle() {
        return vehicle;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setVehicle(String vehicle) {
        if (vehicle != null)
            this.vehicle = vehicle;
    }

    public void setWeapon(String weapon) {
        if (weapon != null)
            this.weapon = weapon;
    }
}
