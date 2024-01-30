 // Simulate a PDA that accepts language L = {0^n.1^n|n>=1} over alphabet using c++

// #include <iostream>
// #include <stack>
// #include <string>

// using namespace std;

// bool accept(string input) {
   
//     // is a declaration of a stack data structure named stack_ that holds characters (char type) 
//     stack<char> stack;
//     // Push initial stack symbol
//     stack.push('Z0');

//     int i = 0;
//     while (i < input.length()) {
//         if (input[i] == '0') {
//             stack.push('0');
//             i++;
//         } 
//         else if (input[i] == '1') {
//             // Check if there is a corresponding '0' in the stack
//             if (stack.top() == '0') {
//                 stack.pop(); // Pop the '0'
//                 i++;
//             } 
//             else {
//                 return false;
//             }
//         } 
//         else {
//             return false; // Invalid input symbol
//         }
//     }

//     // After processing all input symbols,
//     // stack should have only the initial symbol '$' left
//     if (stack.top() != 'Z0') {
//         return false;
//     }

//     // Stack should be empty except for the initial symbol
//     return stack.size() == 1;
// }

// int main() {
//     string input;

//     cout << "Enter a string: ";
//     cin >> input;

//     if (accept(input)) {
//         cout << "Accepted" << endl;
//     } else {
//         cout << "Rejected" << endl;
//     }

//     return 0;
// }

// Equal no of a and equal no of b


#include <iostream>
#include <stack>
#include <string>

using namespace std;

bool accept(string input) {
    stack<char> stack;
    stack.push('Z'); // Push initial stack symbol

    int i = 0;
    while (i < input.length()) {
        if (input[i] == '0') {
            stack.push('0');
            i++;
        } else if (input[i] == '1') {
            if (!stack.empty() && stack.top() == '0') {
                stack.pop(); // Pop the '0'
                i++;
            } else if (stack.top() == 'Z') {
                stack.push('1'); // Push the '1'
                i++;
            } else {
                return false;
            }
        } else {
            return false; // Invalid input symbol
        }
    }

    // After processing all input symbols,
    // stack should have only the initial symbol 'Z' left
    if (stack.top() != 'Z') {
        return false;
    }
    // Stack should be empty except for the initial symbol
    return stack.size() == 1;
}

int main() {
    string input;

    cout << "Enter a string: ";
    cin >> input;

    if (accept(input)) {
        cout << "Accepted" << endl;
    } else {
        cout << "Rejected" << endl;
    }

    return 0;
}
