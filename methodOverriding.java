package selfpractices;

class shap{
void show(){
    System.out.println("vishal rai");
}
}
class squre extends shap{
    @Override
    void show(){
        super.show();
        System.out.println("Kunj rai");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        shap r=new squre();
        r.show();



    }
}
