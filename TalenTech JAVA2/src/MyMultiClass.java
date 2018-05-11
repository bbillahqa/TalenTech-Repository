// Q1		hw1.trianglePeri();		// Q2		hw1.rectanglePeri();		// Q3		int a =
9;		int b =
11;		int c = a +
b;		System.out.println("Question
3: " +(hw1.question3() + c));				// Q4		if (hw1.firstNumber()
hw1.secondNumber()) {			System.out.println("Question
4: " + (hw1.firstNumber() -
hw1.secondNumber()));		} else
{			System.out.println("Question
4: " + (hw1.secondNumber() -
hw1.firstNumber()));		}		// Q5		hw1.rajAge();		hw1.gurpreetAge();		// was just trying
another way to do it		System.out.println("Question
5: Nahin's age is " +
hw1.nahinAge());
	}
	// Q1	void trianglePeri()
{		int
a = 5;		int b =
7;		int c =
11;		int perimeter = a + b
+ c;		System.out.println("Question
1: " + perimeter);			}
	// Q2	void rectanglePeri()
{		int
a = 9;		int b =
13;		int c =
9;		int d =
13;		int perimeter = a + b
+ c + d;		System.out.println("Question
2: " + perimeter);	}
	// Q3	int question3()
{		int
d = 9;		int e =
11;		int f = d *
e;		return
f;			}
	// Q4	int firstNumber()
{		int
a = 50;		return
a;	}
	int secondNumber()
{		int
a = 30;		return
a;	}
	// Q5
	void rajAge()
{		int
age = 26;		String name =
"Raj's Age is ";		System.out.println("Question
5: " + name + age);	}
	void gurpreetAge()
{		int
age = 26;		String name =
"Gurpreet's Age is ";		System.out.println("Question
5: " + name + age);	}
	int nahinAge()
{		int
age = 22;		return
age;	}}