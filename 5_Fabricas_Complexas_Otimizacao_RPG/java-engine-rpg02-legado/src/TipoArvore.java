public class TipoArvore {
    private String textura50MB;

    public TipoArvore(String textura50MB){
        this.textura50MB = textura50MB;
        System.out.println("Textura de 50MB carregada!");
    }

    public String getTextura50MB(){
        return textura50MB;
    }
}
