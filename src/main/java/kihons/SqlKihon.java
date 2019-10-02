package kihons;

import framework.exceptions.NotImplementedYetException;
import framework.bases.SqlKihonBase;
import java.sql.*;

public class SqlKihon extends SqlKihonBase {

    /* Given SQL Tables defined as:
     * ----------------------------
     * CREATE TABLE Person
       (
         PersonId int not null PRIMARY KEY,
         FirstName varchar(50),
         LastName varchar(50),
         Age int
       )
     *
     * CREATE TABLE Address
       (
         AddressId int not null PRIMARY KEY,
         PersonId int,
         Line1 varchar(50),
         Line2 varchar(50),
         City varchar(50),
         State varchar(50),
         Zip varchar(9)
       )
     */


    @Override
    protected String Select_All_Fields_And_Rows_From_Person() {
        return "select * from Person";
    }

    @Override
    protected String selectAllFieldsFromPersonJoinedToAddress() {
        return "select * from Person p join Address a on p.PersonId = a.PersonId ";
            }

    @Override
    protected String selectFirstNameFromPersonWhereLastNameEqualsRayburn() {

        return "select FirstName from Person where LastName = 'Rayburn' ";
    }

    @Override
    protected String selectAllFieldsFromPersonLeftOuterJoinedToAddress() {

        return "select * from Person p left join Address a on p.PersonId = a.PersonId";
    }

    @Override
    protected String insertPersonId4NamedMikeJohnsonAge5ToPerson() {
        return "insert into Person (PersonId, FirstName, LastName, Age) values (4, 'Mike', 'Johnson', 5)";
    }

    @Override
    protected String updateAllLastNamesRayburnToJohnsonInPerson() {

        return "update Person set LastName = 'Johnson' where LastName = 'Rayburn' ";
    }
}
