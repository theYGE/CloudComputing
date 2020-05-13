# Олександр Макаревич, МІ-4 2020

<b> Завдання: </b> задано число N. Знайти всі perfect squares [1,N]
<b> Сервери: </b> app та hosts-server у регіоні europe-north1-a та 4 сервери для розпаралелювання у регіоні us-central1-c
<b> Результати: </b> 
<table>
<tr>
  <th> N/Time with number of servers (in seconds) </th>
  <th> 1 Server </th>
  <th> 2 Servers </th>
  <th> 3 Servers </th>
  <th> 4 Servers </th>
</tr>

<tr>
  <td> 1 000 000 </td>
  <td> 2.29 </td>
  <td> 2.094 </td>
  <td> 2.223 </td>
  <td> 2.739 </td>
</tr>

<tr>
  <td> 2 000 000 </td>
  <td> 4.719 </td>
  <td> 3.85 </td>
  <td> 3.713 </td>
  <td> 3.654 </td>
</tr>

<tr>
  <td> 3 000 000 </td>
  <td> 7.571 </td>
  <td> 4.864 </td>
  <td> 7.089 </td>
  <td> 4.223 </td>
</tr>

<tr>
  <td> 4 000 000 </td>
  <td> 10.719 </td>
  <td> 7.259 </td>
  <td> 6.52 </td>
  <td> 7.225 </td>
</tr>

<tr>
  <td> 5 000 000 </td>
  <td> 14.483 </td>
  <td> 9.206 </td>
  <td> 6.461 </td>
  <td> 7.503 </td>
</tr>

<tr>
  <td> 6 000 000 </td>
  <td> 18.429 </td>
  <td> 10.7 </td>
  <td> 10.351 </td>
  <td> 9.429 </td>
</tr>

<tr>
  <td> 7 000 000 </td>
  <td> 23.418 </td>
  <td> 13.301 </td>
  <td> 10.203 </td>
  <td> 8.241 </td>
</tr>

<tr>
  <td> 8 000 000 </td>
  <td> 23.611 </td>
  <td> 14.978 </td>
  <td> 11.816 </td>
  <td> 12.458 </td>
</tr>

<tr>
  <td> 9 000 000 </td>
  <td> 32.952 </td>
  <td> 17.523 </td>
  <td> 13.279 </td>
  <td> 12.554 </td>
</tr>

<tr>
  <td> 10 000 000 </td>
  <td> 38.327 </td>
  <td> 19.081 </td>
  <td> 15.716 </td>
  <td> 14.068 </td>
</tr>

<tr>
  <td> 11 000 000</td>
  <td> 44.0 </td>
  <td> 22.639 </td>
  <td> 18.296 </td>
  <td> 12.708 </td>
</tr>

<tr>
  <td> 12 000 000 </td>
  <td> 50.032 </td>
  <td> 28.399 </td>
  <td> 24.51 </td>
  <td> 16.902 </td>
</tr>

<tr>
  <td> 13 000 000 </td>
  <td> 56.204 </td>
  <td> 28.341 </td>
  <td> 24.488 </td>
  <td> 17.983 </td>
</tr>

<tr>
  <td> 14 000 000</td>
  <td> 54.025 </td>
  <td> 30.005 </td>
  <td> 24.127 </td>
  <td> 19.878 </td>
</tr>

<tr>
  <td> 15 000 000</td>
  <td> 59.534 </td>
  <td> 42.044 </td>
  <td> 27.399 </td>
  <td> 22.39 </td>
</tr>
</table>
