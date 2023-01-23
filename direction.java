/*
 * --------------------------------
 *    x = 3
 *    y = 3
 *    start  = 2-2-E
 *    path = R M L M L M
 *    Output = 3-2-N
 *    Explation:
 *      2-2-E -> 2-2-S -> 2-1-S -> 2-1-E -> 3-1-E -> 3-1-N -> 3-2-N
 * --------------------------------
 */

public class direction {

    public String direction(int x, int y, String start, String path) {
        String output = "";
        boolean flag = false;
        int xAxis = Integer.valueOf(start.substring(0, start.indexOf('-')));
        int yAxis = Integer.valueOf(start.substring((start.lastIndexOf('-') - 1), (start.lastIndexOf('-'))));
        char CurrentFace = start.charAt(start.length() - 1);
        
        String[] steps = path.split(" ");

        for(int i=0; i<steps.length; i++){
            if(steps[i].equals("L")){
                if(CurrentFace == 'E'){
                    CurrentFace = 'N';
                }else if(CurrentFace == 'W'){
                    CurrentFace = 'S';
                }else if(CurrentFace == 'N'){
                    CurrentFace = 'W';
                }else if(CurrentFace == 'S'){
                    CurrentFace = 'E';
                }
            }else if(steps[i].equals("R")){
                if(CurrentFace == 'E'){
                    CurrentFace = 'S';
                }else if(CurrentFace == 'W'){
                    CurrentFace = 'N';
                }else if(CurrentFace == 'N'){
                    CurrentFace = 'E';
                }else if(CurrentFace == 'S'){
                    CurrentFace = 'W';
                }
            }else if(steps[i].equals("M")){
                if(CurrentFace == 'N' && xAxis <= x && yAxis != y){
                    yAxis += 1;
                }else if(CurrentFace == 'S' && xAxis <= x && yAxis <= y){
                    yAxis -= 1;
                }else if(CurrentFace == 'E' && xAxis != x && yAxis <= y){
                    xAxis += 1;
                }else if(CurrentFace == 'W' && xAxis <= x && yAxis <= y){
                    xAxis -= 1;
                }else{
                    flag = true;
                    break;
                }
            }
        }

        if(flag){
            output = String.valueOf(xAxis)+"-"+String.valueOf(yAxis)+"-"+CurrentFace+"-"+"ERROR";
        }else{
            output = String.valueOf(xAxis)+"-"+String.valueOf(yAxis)+"-"+CurrentFace;
        }

        return output;
    }

    public static void main(String[] args) {
        direction obj = new direction();
        System.out.println(obj.direction(3, 3, "1-0-S", "R M L M L M"));
    }
}
