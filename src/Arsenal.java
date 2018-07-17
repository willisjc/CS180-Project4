public class Arsenal {
    private Equipment equipment;
    private SuperPowers superPowers;

    public Arsenal() {
        equipment = new Equipment();
        superPowers = new SuperPowers();
    }


    public Equipment getEquipment() {
        return equipment;
    }

    public SuperPowers getSuperPowers() {
        return superPowers;
    }


}
