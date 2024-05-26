import java.util.Scanner;

public class Bus_List {
    Scanner scanner = new Scanner(System.in);
    String[] bus={"business class","AC","non Ac"};
    String[][] bus_name={{"Hanif Express",
            "Shymoli Express","Green Line"},
            {"Royal Express","Shohag","St. Martin's Island"},{"Dipjol Express"," Ena Travels","SK Express"}};

    void view(){
        for(int i=0; i<3; i++){
            System.out.printf("%d. %s\n",i+1,bus[i]);
        }
        System.out.println("Choose a Bus ");
        int xx=scanner.nextInt();
        for(int i=xx-1; i<xx; i++){
            for(int j=0; j<3; j++){
                System.out.printf("%d. %s\n",j+1,bus_name[i][j]);
            }
        }
    }
}
