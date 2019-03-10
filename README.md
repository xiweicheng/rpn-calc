> 用Java写一个逆波兰式的计算器。

## 需求：
> 这个计算器有一个栈Stack，Stack里面(仅)可以容纳数字。

1. 这个计算器等待用户的输入，输入的内容可以是包含空格分开的数字和计算符号。
2. 输入的数字被压到stack，输入的计算符号将对stack最顶部的两个数字进行运算并将结果压到stack顶部。
3. 运算符号包括+, -, *, /, sqrt, undo, clear
4. 运算符号将最顶部的两个数字弹出stack，并将运算的结果压到stack上
5. 'clear'运算符号将stack中所有的数字移除。
6. ’undo‘ 运算符号将回滚上一个运算符号的运算。'undo undo'将回滚上两个运算符号。
7. 'sqrt'运算符号将对stack顶部的一个数字进行开根号运算，并将结果压回到stack.
8. ‘+’, ‘-’, ‘*’, ‘/’ 将对stack顶部的两个数字进行加减乘数运算。
9. 在处理完输入以后，计算器将输出当前stack中的数字，以空格分隔数字。
10. 数字在stack中存储的时候以至少15位保存，但是显示的时候最多以10位表示。
11. 显示的数字不需要用科学计数法，用最简单的表示即可。
12. 假如一个运算符找不到最够的运算数字，需要输出报警信息：operator <operator> (position: <pos>): insufficient parameters。并且在输出警报以后，后续的输出字符处理不再进行，直接显示当前的stack里面的内容即可。

## 测试用例：

```
==
1.
输入：1 2 3 4 5
输出：stack: 1 2 3 4 5 
输入：*
输出：stack: 1 2 3 20 
输入：clear 3 4 - 
输出：stack: - 1

==
（以下类似，以stack开头的是输出）
2.
1 2 3 4 5
stack: 1 2 3 4 5 
** **
stack: 120

3.
5 4 3 2
stack: 5 4 3 2 
undo undo * 
stack: 20
5*
stack: 100 
undo
stack: 20 5

4.
2 sqrt
stack: 1.4142135623 
clear 9 sqrt
stack: 3

5.
1 2 3 * 5 + * * 6 5
operator * (position: 15): insucient parameters 
stack: 11
(the 6 and 5 were not pushed on to the stack due to the previous error)

```