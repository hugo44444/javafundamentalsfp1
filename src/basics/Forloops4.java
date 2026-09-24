package basics;

public class ForLoop4 {

public static void main(String[] args) {

int sum = 1 + 2 + 3 + 4 + 5; //20
System.out.println(sum);
sum = 0;

sum = 0;
int j = 0;

j++;
sum = sum + j;
j++;
sum = sum + j;
j++;
sum = sum + j;

System.out.println(sum);
int i = 0;
for (; i < 4;) {
i++;
sum = sum + i;
}
System.out.println(sum);
}
}
