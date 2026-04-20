public class FabricaOrquica implements FabricaEquipamentos{
    @Override
    public Arma criarArma() {
        return new MachadoOrc();
    }

    @Override
    public Armadura criarArmadura() {
        return new ArmaduraOrc();
    }
}
