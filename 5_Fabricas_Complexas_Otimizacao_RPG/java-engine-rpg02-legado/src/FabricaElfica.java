public class FabricaElfica implements FabricaEquipamentos{
    @Override
    public Arma criarArma() {
        return new EspadaElfica();
    }

    @Override
    public Armadura criarArmadura() {
        return new TunicaElfica();
    }
}
