
//STRING1-HELLONAME
public String helloName(String name) {
        return "Hello " + name + "!";
        }

//Public-accessible from other classes
//String name is the parameter for greeting by the name
//return-returning statement showing Hello and the name


//ARRAY 1 NO23
public boolean no23(int[] nums) {
        for (int num : nums) {
        if (num == 2 || num == 3) {
        return false;
        }
        }
        return true;
        }
//for each loop
//integer array num, returns a boolean value
//no23-unique name can be adjusted by user
//If num is equal to 2 or 3, function will return false
//otherwise if not contained-return will be true


//ARRAY1 REVERSE3
public int[] reverse3(int[] nums) {
        int[] result = new int[3];
        result[0] = nums[2];
        result[1] = nums[1];
        result[2] = nums[0];
        return result;
        }
//int[]- to return an array of integers
//int[] result = new int[3]-creating new integer with length of 3 ( result)
//reverse3-unique name can be adjusted by user
//int[] num - parameter list being assigned to nums variable
//By assigning result to nums in reverse order it will return reversed array


//ARRAY1 SUM 3
public int sum3(int[] nums) {
        int sum = 0;
        for (int num : nums) {
        sum += num;
        }
        return sum;
        }
//sum=0 -integer variable, storing sum of elements
//sum3-unique name can be adjusted by user
//for each loop-adds value of num to current sum (+=)
//return-return final value of all element array sum



//STRING2 CATDOG
public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {
        if (str.substring(i, i + 3).equals("cat")) {
        catCount++;
        }
        if (str.substring(i, i + 3).equals("dog")) {
        dogCount++;
        }
        }

        return catCount == dogCount;
        }
//int catCount & dogCount = 0 variables to count cat and dog in the string
//for loop-iterates characters in the string and checks if each substring is equal to cat/dog
//str.substring(i, i + 3): Extracts a substring of length 3 starting from index i



//RECURSION1 BUNNYEARS2
public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
        return 0;  // Base case: No bunnies, no ears.
        } else if (bunnies % 2 == 0) {
        return 3 + bunnyEars2(bunnies - 1);  // Recursive case: Even-numbered bunny has 3 ears.
        } else {
        return 2 + bunnyEars2(bunnies - 1);  // Recursive case: Odd-numbered bunny has 2 ears.
        }
        }
//if bunnies are 0 there are no bunnies/no ears to count-return 0
//if bunnies are even ( divisible by 2) we add 3 to the count
// recursively we call bunnyEar2 with bunnies-1 to determine remaining bunnies
//if odd number of bunnies, add 2 to ear for current bunny
//recursively call bunnyEar2 with bunnies-1


//LOGIC-1 ANSWERCELL
public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
        return false;
        } else if (isMorning && !isMom) {
        return false;
        } else {
        return true;
        }
        }
//Takes three parameters using boolean value-ismorning, ismom, isasleep
//If else statements-indicating false if not pick up, true to pickup
//else if -morning and ismom is false then dont pickup



//LOGIC 1 GREENTICKET
public int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
        return 20;  // All numbers are the same.
        } else if (a == b || b == c || a == c) {
        return 10;  // Two numbers are the same.
        } else {
        return 0;  // All numbers are different.
        }
        }
//takes three parameters type integer
//if all three numbers abc are the same return 20
//if two numbers are the same, return 10
//if none are met or different, return 0



//LOGIC 1 BLUETICKET
public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10) {
        return 10;
        } else if (ab - bc == 10 || ab - ac == 10) {
        return 5;
        } else {
        return 0;
        }
        }
//takes three parameters type integer
//pairs: ab, bc, ac
//if pair sum are equal to 10 return 10
//if pair difference equal to 10 return 5
//otherwise return 0