package katas.stage1;

public class RomanToInt {
    public static void main(String[] args) {
        String romanNum = "XCII";
        System.out.println(romanToInt(romanNum));
    }

    public static int romanToInt(String s) {
        int number = 0;
        String str = s.toLowerCase();
        int indexCounter = 0;

        while(indexCounter < str.length()){
            //add 1
            if(str.charAt(indexCounter) == 'i'){
                number += 1;
            }

            //add 5
            else if(str.charAt(indexCounter) == 'v'){
                number += 5;
                // count as 4, sub 2
                if((indexCounter - 1) >= 0 && str.charAt(indexCounter - 1) == 'i'){
                    number -= 2;
                }
            }

            //add 10
            else if (str.charAt(indexCounter) == 'x') {
                number += 10;
                //count as 9, sub 2
                if((indexCounter - 1) >= 0 && str.charAt(indexCounter - 1) == 'i'){
                    number -= 2;
                }
            }

            //add 50
            else if (str.charAt(indexCounter) == 'l') {
                number += 50;
                // count as 40, sub 20
                if(indexCounter - 1 >= 0 && str.charAt(indexCounter - 1) == 'x'){
                    number -= 20;
                }
            }

            //add 100
            else if (str.charAt(indexCounter) == 'c'){
                number += 100;
                //count as 90, sub 20
                if(indexCounter - 1 >= 0 && str.charAt(indexCounter - 1) == 'x'){
                    number -= 20;
                }
            }

            //add 500
            else if (str.charAt(indexCounter) == 'd') {
                number += 500;
                //count as 400, sub 200
                if(indexCounter - 1 >= 0 && str.charAt(indexCounter - 1) == 'c'){
                    number -= 200;
                }
            }

            //add 1000
            else if(str.charAt(indexCounter) == 'm'){
                number += 1000;
                //count as 900, sub 200
                if(indexCounter - 1 >= 0 && str.charAt(indexCounter - 1) == 'c'){
                    number -= 200;
                }
            }
            indexCounter++;
        }
        return number;
    }
}

// if((indexCounter + 1) < str.length() && str.charAt(indexCounter + 1) =='v'){
//        number += 3;
//        indexCounter += 1;
//        }