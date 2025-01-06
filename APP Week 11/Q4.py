def is_palindrome(word):
    return word == word[::-1]

def find_palindromes(sentence):
    palindromes = []
    words = sentence.split()
    for word in words:
        if is_palindrome(word):
            palindromes.append(word)
    return palindromes

# Example usage
sentence = "A man a plan a canal Panama"
palindromes = find_palindromes(sentence)
print("Palindromic words in the sentence:", palindromes)