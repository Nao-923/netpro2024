import java.io.Serializable;

public class Math implements ITask,Serializable {
    int n;
    int result;

    @Override
    public void setExecNumber(int x) {
       this.n = x;
    }

    @Override
    public void exec() {
        if (n <= 1) {
            this.result = n + 1;
        }
        else if (n <= 3) {
            this.result = n + 3;
        }
        else if(n >= 4){
            this.result = n + 4;
        }
        
    }

    @Override
    public int getResult() {
        return result;
    }
    
}
