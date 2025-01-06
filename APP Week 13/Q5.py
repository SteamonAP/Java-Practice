def nfa_transition(nfa, current_states, symbol):
    next_states = set()
    
    for state in current_states:
        if state in nfa and symbol in nfa[state]:
            next_states |= nfa[state][symbol]

    return next_states

# Example NFA
nfa = {
    0: {'a': {0, 1}},
    1: {'b': {2}},
    2: {'c': {3}},
    3: {'d': {4}},
    4: {'e': {5}},
}

# Function to get the set of states reached from a state on a specific input symbol
def get_reachable_states(nfa, current_states, symbol):
    next_states = nfa_transition(nfa, current_states, symbol)
    return next_states

# Test the function with a specific state and symbol
current_state = 0
input_symbol = 'a'

reachable_states = get_reachable_states(nfa, {current_state}, input_symbol)
print(f"From state {current_state} on symbol '{input_symbol}', we can reach states: {reachable_states}")