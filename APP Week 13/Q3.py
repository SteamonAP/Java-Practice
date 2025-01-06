def nfa_transition(state, symbol):
    if state == 0 and symbol == 'a':
        return {0, 1}
    elif state == 1 and symbol == 'a':
        return {0}
    else:
        return set()

def nfa_to_dfa(nfa, alphabet):
    dfa = {}
    unprocessed_states = [frozenset({0})]  # Start with the initial state

    while unprocessed_states:
        current_nfa_state = unprocessed_states.pop()
        dfa_state = frozenset()
        for symbol in alphabet:
            nfa_transitions = set()
            for nfa_state in current_nfa_state:
                nfa_transitions |= nfa_transition(nfa_state, symbol)
            dfa_state |= nfa_transitions
            if dfa_state:
                unprocessed_states.append(dfa_state)
        dfa[current_nfa_state] = dfa_state

    return dfa

# Define the NFA alphabet
nfa_alphabet = {'a'}

# Convert the NFA to a DFA
nfa = {
    0: {'a': {0, 1}},
    1: {'a': {0}}
}

dfa = nfa_to_dfa(nfa, nfa_alphabet)

# Print the resulting DFA
print("DFA State Transitions:")
for state, transitions in dfa.items():
    print(f"State {state} -> {transitions}")