import java.util.Random;
import java.util.Scanner;
import java.io.EOFException;
public class ded {
    private static Scanner scn;
    private static int x,y;
    private static String search,s;
    private static String column(String str,int b ){
        for (int i = 0; i < b; i++) {
            if(str.length()<b){
                str = str+ " ";
            }
        }
        return str;
    }

    public static void main(String[] args) {
        int n,action;
        String[] name_ = {"Игорь","Валерий","Михаил","Леонтий","Сергей","Григорий","Павел","Олег","Николай","Евгений","Виктор","Чак","Филллип","Киррил","Дмитрий","Алексей","Ярослав","Ростислав","Антон","Валерий","Станислав","Леонид","Артем","Никита","Юлий","Марк","Владислав","Эдуард","Василий","Давид","Юрий","Борис"};
        String name;
        String[] serName_ = {"Борю","Таращик","Спица","Гоменюк","Круг","Коваль","Селезнев","Соловьев","Птах","Коцюба","Стасик","Головчук","Матвиенко","Еременко","Ермоленко","Шевченко","Мкртчан","Грач","Сорока","Вовк"};
        String serName;
        String[] midName_ = {"Евгениевич","Потапович","Василевич","Романович","Дмитриевич","Григориевич","Прохорович","Киррилович","Юриевич"};
        String midName;
        String[] Adress_ = {"Прохорова 35","Ленина 87","Леплика 25"};
        String Adress;
        int Phone = 0;
        String[] diagnosis_ = {"Грип","Пневмония","Ветрянка","Гангрена","Рак","Катаракта","Гипертрофия","Геморой","Гайморит","Сифилис","ОРВ"};
        String diagnosis;
        scn = new Scanner(System.in);
        System.out.print("Colichestva pacientov : ");
        n = scn.nextInt();
        Patient p[]=new Patient[n];
        Random r = new Random();
        for (int j = 0; j < n; j++) {
            name =name_[r.nextInt(name_.length)];

            serName=serName_[r.nextInt(serName_.length)];

            midName=midName_[r.nextInt(midName_.length)];

            Adress=Adress_[r.nextInt(Adress_.length)];

            diagnosis=diagnosis_[r.nextInt(diagnosis_.length)];

            Phone=10000+r.nextInt(9999);

            p[j]=new Patient(column(name,12),column(serName,10),column(midName,12),column(Adress,12),column(diagnosis,10),Phone,1000+j,j);
        }
        for (int i = 0; i < n; i++) {
            p[i].ShowInfo();
        }
        System.out.println("Vyberite cifru : ");
        System.out.println("(1) Poisk po nomeru : ");
        System.out.println("(2) Poisk po diagnos: ");
         action = scn.nextInt();
        scn.nextLine();
        switch (action){
            case 1:
                System.out.println("Ukajite interval: ");
                x=scn.nextInt();
                y=scn.nextInt();
                for (int l = 0; l < n; l++) {
                    if((p[l].getCard()>=x && (p[l].getCard()<=y))){
                        p[l].ShowInfo();
                    }
                }
                break;
            case 2:
                System.out.println("Vvedite diagnos dlya poiska: ");
                search=scn.nextLine();
                for (int k = 0; k < n; k++) {
                    s=p[k].getDiagnosis();
                    if(s.trim().equalsIgnoreCase(search.trim())==true){
                        p[k].ShowInfo();
                    }
                }
                break;
        }

    }
}