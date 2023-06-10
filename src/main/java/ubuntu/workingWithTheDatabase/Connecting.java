package ubuntu.workingWithTheDatabase;

import java.sql.*;

public class Connecting {
    public static void main(String[] args) throws ClassNotFoundException {
        String userName = "root";
        String password = "root";
        String connectionURL = "jdbc:mysql://localhost:3306/human_friends";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Connection connection = DriverManager.getConnection(connectionURL, userName, password);
            System.out.println("Подключение к базе данных");
            Statement statement = connection.createStatement();
            /**
             * Создали таблицу с животными
             */
//            statement.executeUpdate("CREATE TABLE Animals_classes(Id INT AUTO_INCREMENT,Class_name " +
//                    "VARCHAR(40) not null, PRIMARY KEY(id));");
//            System.out.println("Таблица создана");
//            statement.executeUpdate("INSERT INTO Animals_classes (Class_name) VALUES ('Домашние животные')");
//            statement.executeUpdate("INSERT INTO Animals_classes (Class_name) VALUES ('Вьючные животные')");
            /**
             * Создали таблицу с вьючими животными
             */
//            statement.executeUpdate("CREATE TABLE pack_animals(Id INT AUTO_INCREMENT PRIMARY KEY,animal VARCHAR(40) " +
//                    "not null, id_class INT, FOREIGN KEY(id_class) REFERENCES Animals_classes(id) ON DELETE CASCADE ON UPDATE CASCADE);");
//            statement.executeUpdate("INSERT INTO pack_animals (animal, id_class) VALUES ('Лошади', '2')");
//            statement.executeUpdate("INSERT INTO pack_animals (animal, id_class) VALUES ('Верблюды', '2')");
//            statement.executeUpdate("INSERT INTO pack_animals (animal, id_class) VALUES ('Ослы', '2')");
            /**
             * Создали таблицу с домашними животными
             */
//            statement.executeUpdate("CREATE TABLE Pets(Id INT AUTO_INCREMENT PRIMARY KEY,animal VARCHAR(40) " +
//                    "not null, id_class INT, FOREIGN KEY(id_class) REFERENCES Animals_classes(id) ON DELETE CASCADE ON UPDATE CASCADE);");
//            statement.executeUpdate("INSERT INTO Pets (animal, id_class) VALUES ('Собаки', '1')");
//            statement.executeUpdate("INSERT INTO Pets (animal, id_class) VALUES ('Кошки', '1')");
//            statement.executeUpdate("INSERT INTO Pets (animal, id_class) VALUES ('Хомяки', '1')");
            /**
             * Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения
             */
//            statement.executeUpdate("CREATE TABLE cat ( Id INT AUTO_INCREMENT PRIMARY KEY, Name VARCHAR(30), " +
//                    "dates_of_birth DATE, teams VARCHAR(60), id_genus INT, FOREIGN KEY(id_genus) REFERENCES Pets(id) ON DELETE CASCADE ON UPDATE CASCADE);");
//            statement.executeUpdate("INSERT INTO cat (Name, dates_of_birth, teams, id_genus) VALUES " +
//                    "('Барсик', '2023.01.01', 'кис-кис-кис','2')," +
//                    "('Мартин', '2023.03.06', 'Мартин , брысь!!!','2')," +
//                    "('Дуся', '2023.06.10', 'Дуся !! ГОЛОС!!!','2')");
//
//            statement.executeUpdate("CREATE TABLE dog ( Id INT AUTO_INCREMENT PRIMARY KEY, Name VARCHAR(30), " +
//                    "dates_of_birth DATE, teams VARCHAR(60), id_genus INT, FOREIGN KEY(id_genus) REFERENCES Pets(id) " +
//                    "ON DELETE CASCADE ON UPDATE CASCADE);");
//            statement.executeUpdate("INSERT INTO dog (Name, dates_of_birth, teams, id_genus) VALUES " +
//                    "('Рекс', '2022.12.04', 'Сидеть!!','1')," +
//                    "('Рей', '2023.02.02', 'Лежать!!','1')," +
//                    "('Джесси', '2023.03.03', 'Апорт!','1')");
//
//            statement.executeUpdate("CREATE TABLE hamster ( Id INT AUTO_INCREMENT PRIMARY KEY, Name VARCHAR(30), " +
//                    "dates_of_birth DATE, teams VARCHAR(60), id_genus INT, FOREIGN KEY(id_genus) REFERENCES Pets(id) " +
//                    "ON DELETE CASCADE ON UPDATE CASCADE);");
//            statement.executeUpdate("INSERT INTO hamster (Name, dates_of_birth, teams, id_genus) VALUES " +
//                    "('Буся', '2023.05.11', '...','3')," +
//                    "('Ириска', '2023.05.02', '...','3')," +
//                    "('Хома', '2023.04.03', '...','3')");

//            statement.executeUpdate("CREATE TABLE horse ( Id INT AUTO_INCREMENT PRIMARY KEY, Name VARCHAR(30), " +
//                    "dates_of_birth DATE, teams VARCHAR(60), id_genus INT, FOREIGN KEY(id_genus) REFERENCES pack_animals(id) ON DELETE CASCADE ON UPDATE CASCADE);");
//            statement.executeUpdate("INSERT INTO horse (Name, dates_of_birth, teams, id_genus) VALUES " +
//                    "('Баррикада', '2022.01.01', 'Но, пошла','1')," +
//                    "('Забастовщик', '2021.03.06', 'Но!!','1')," +
//                    "('Террор', '2022.03.10', 'Ну!!!','1')");
//
//            statement.executeUpdate("CREATE TABLE camel ( Id INT AUTO_INCREMENT PRIMARY KEY, Name VARCHAR(30), " +
//                    "dates_of_birth DATE, teams VARCHAR(60), id_genus INT, FOREIGN KEY(id_genus) REFERENCES pack_animals(id) " +
//                    "ON DELETE CASCADE ON UPDATE CASCADE);");
//            statement.executeUpdate("INSERT INTO camel (Name, dates_of_birth, teams, id_genus) VALUES " +
//                    "('Пепе', '2020.12.04', 'Право!!','2')," +
//                    "('Бактриан', '2021.02.02', 'Пошел!!','2')," +
//                    "('Дромедар', '2023.09.03', 'Назад!','2')");
//
//            statement.executeUpdate("CREATE TABLE Donkey ( Id INT AUTO_INCREMENT PRIMARY KEY, Name VARCHAR(30), " +
//                    "dates_of_birth DATE, teams VARCHAR(60), id_genus INT, FOREIGN KEY(id_genus) REFERENCES pack_animals(id) " +
//                    "ON DELETE CASCADE ON UPDATE CASCADE);");
//            statement.executeUpdate("INSERT INTO Donkey (Name, dates_of_birth, teams, id_genus) VALUES " +
//                    "('Ослик', '2023.05.11', '...','3')," +
//                    "('И-а', '2023.05.02', '...','3')," +
//                    "('Осел', '2023.04.03', '...','3')");
            /**
             * Удаляем верблюдов
             */
//            statement.executeUpdate("DROP TABLE camel");
            /**
             * Объединяем лошадей и ослов в новой таблице
             */
//            statement.executeUpdate("CREATE TABLE horses_and_donkeys ( Id INT AUTO_INCREMENT PRIMARY KEY, Name VARCHAR(30), " +
//                    "dates_of_birth DATE, teams VARCHAR(60), id_genus INT, FOREIGN KEY(id_genus) REFERENCES pack_animals(id) " +
//                    "ON DELETE CASCADE ON UPDATE CASCADE);");
//            statement.executeUpdate("INSERT INTO horses_and_donkeys ( Name, dates_of_birth, teams, id_genus) SELECT  Name, " +
//                    "dates_of_birth, teams, id_genus FROM horse UNION SELECT  Name, dates_of_birth, teams, id_genus " +
//                    "FROM donkey;");
            /**
             * для задание под номером 11, создадим сначала временную таблицу, что бы могли использовать список
             * животных. к какому виду принадлежат
             */
//            statement.executeUpdate("CREATE TEMPORARY TABLE animals AS SELECT *, 'Лошади' AS affiliation FROM horse " +
//                    "UNION SELECT *, 'Ослы' AS affiliation FROM donkey UNION SELECT *, 'Собаки' AS affiliation FROM " +
//                    "dog UNION SELECT *, 'Кошки' AS affiliation FROM cat UNION SELECT *, 'Хомяки' AS affiliation FROM" +
//                    " hamster;");
//
//            statement.executeUpdate("CREATE TABLE young_animals AS SELECT Name, dates_of_birth, teams, affiliation," +
//                    "TIMESTAMPDIFF(MONTH, dates_of_birth, CURDATE()) AS age_in_months FROM animals WHERE " +
//                    "dates_of_birth BETWEEN ADDDATE(curdate(), INTERVAL -3 YEAR) AND ADDDATE(CURDATE(), INTERVAL -1 YEAR);");
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM animals_classes");
//            while (resultSet.next()){
//                int id = resultSet.getInt(1);
//                String Class_name = resultSet.getNString(2);
//                System.out.printf("%d,%s %n", id, Class_name);
//            }
            /**
             * Объединяем все таблицы в одну
             */
            ResultSet resultSet = statement.executeQuery("SELECT h.Name, h.dates_of_birth, h.teams, pa.animal, ya" +
                    ".age_in_months FROM horse" +
                    " h LEFT JOIN young_animals ya ON ya.Name = h.Name LEFT JOIN pack_animals pa ON pa.Id = h" +
                    ".id_genus UNION SELECT d.Name, d.dates_of_birth, d.teams, pa.animal, ya.age_in_months FROM " +
                    "donkey d LEFT JOIN young_animals ya ON ya.Name = d.Name LEFT JOIN pack_animals pa ON pa.Id = d" +
                    ".id_genus UNION SELECT c.Name, c.dates_of_birth, c.teams, ha.animal, ya.age_in_months FROM cat c" +
                    " LEFT JOIN young_animals ya ON ya.Name = c.Name LEFT JOIN pets ha ON ha.Id = c.id_genus UNION " +
                    "SELECT d.Name, d.dates_of_birth, d.teams, ha.animal, ya.age_in_months FROM dog d LEFT JOIN " +
                    "young_animals ya ON ya.Name = d.Name LEFT JOIN pets ha ON ha.Id = d.id_genus UNION SELECT hm" +
                    ".Name, hm.dates_of_birth, hm.teams, ha.animal, ya.age_in_months FROM hamster hm LEFT JOIN " +
                    "young_animals ya ON ya.Name = hm.Name LEFT JOIN pets ha ON ha.Id = hm.id_genus;");
            while (resultSet.next()) {
                String Class_name = resultSet.getNString(1);
                String dates_of_birth = String.valueOf(resultSet.getDate(2));
                String teams = resultSet.getNString(3);
                String animal = resultSet.getNString(4);
                int age_in_months = resultSet.getInt(5);
                System.out.printf("Кличка: %s, Дата рождения: %s, Команды: %s, класс: %s, возраст в месяцах: %d " +
                                "%n",
                        Class_name,dates_of_birth,teams,animal,age_in_months);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
