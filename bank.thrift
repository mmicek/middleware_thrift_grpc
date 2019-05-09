
namespace cpp tutorial
namespace d tutorial
namespace dart tutorial
namespace java sr.rpc.thrift
namespace php tutorial
namespace perl tutorial
namespace haxe tutorial

// XXXXXXXXXXXXXXXXXX

enum AccountType{
    STANDARD = 1,
    PREMIUM = 2
}

enum Currency{
    EUR = 1,
    PLN = 2,
    DOL = 3
}

struct UserData{
    1: string imie,
    2: string nazwisko,
    3: string pesel,
    4: i32 miesiecznyDochod
}

struct AccountDetails{
    1: string klucz,
    2: AccountType typKonta
}

struct CurrencyDetails{
    1: i32 kosztWalutaObca,
    2: i32 kosztWalutaRodzima
}

exception CurrencyNotSupported{
    1: string message
}

exception UserException{
    1:string message
}

service Bank{
     AccountDetails createUser(1:UserData dane) throws (1: UserException ex),
     CurrencyDetails activeCredit(1: string pesel,2: string klucz,3: Currency waluta,4: i32 kwota) throws (1: UserException ex,2: CurrencyNotSupported currEx),
     CurrencyDetails getAccountBalance(1: string pesel,2: string klucz) throws (1: UserException ex)
}