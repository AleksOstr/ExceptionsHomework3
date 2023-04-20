### Задание:

Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, 
разделенные пробелом:
Фамилия Имя Отчество датарождения номертелефона пол
Форматы данных:
фамилия, имя, отчество - строки

дата_рождения - строка формата dd.mm.yyyy

номер_телефона - целое беззнаковое число без форматирования

пол - символ латиницей f или m.

Приложение должно проверить введенные данные по количеству. 
Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение, 
что он ввел меньше и больше данных, чем требуется.

Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. 
Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. 
Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, 
пользователю выведено сообщение с информацией, что именно неверно.

Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, 
в него в одну строку должны записаться полученные данные, вида

<Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>

Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

Не забудьте закрыть соединение с файлом.

При возникновении проблемы с чтением-записью в файл, 
исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.

### Комментарии к решению:

Программа принимает от пользователя данные в следующем порядке:

Фамилия Имя Отчество Дата_рождения Пол Номер_телефона (разделитель - пробел)

При вводе неверного количества данных программа сообщит пользователю, что он ввел больше или меньше данных, чем требуется

**Формат ввода данных:**

* Фамилия, Имя, Отчество - заглавные и строчные латинские буквы
* Дата рождения - дд.мм.гггг
* Пол - f или m
* Номер телефона - 71234567890 (без знаков и форматирования, строго 11 символов, начало номера строго с цифры 7)

Реализованна проверка введенной даты рождения - программа не примет дату рождения из будущего, 
несуществующую дату типа 30.02.2004, а также дату раньше чем 01.01.1900.

Если пользователь корректно ввел все данные, программа запишет строку с данными в файл с именем **<фамилия>.txt**, данные 
на однофамильцев будут записываться в одинаковый файл. При успешной записи программа выдаст соответствующее сообщение и
будет запрашивать у пользователя новые данные, пока тот не остановит ее командой **"exit"**.