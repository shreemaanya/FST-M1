import pytest 

#here the pattern need to be mentioend first before parameters - in which order the inputs need to be matched 
#words in pattern should match exactly to the prgm else it mismatches 

@pytest.mark.parametrize("earned,spent,expected",[(30,10,20),(20,2,18)])

def test_balance(wallet,earned,spent,expected):
#add earned amount to wallet
    wallet += earned

#subsctract spent amount from wallet 
    wallet -= spent

#assert remaining balance 
    assert wallet == expected 

#pytest -m activity -k "test_balance"
#pytest -v -k "test_balance"
