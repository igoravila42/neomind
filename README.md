O Problema: Escreva um programa onde, dado um determinado horário, ele seja
capaz de calcular o ângulo entre os 2 ponteiros do relógio.
Premissas:
1. Considere:
• 00:00h possui um ângulo de 0
• 00:15h possui um ângulo de 45
• 00:30h possui um ângulo de 180
2. Construtor do método:
public long retornaAnguloRelogio(GregorianCalendar horario);
3. O desafio deve ser entregue escrito em Java ou linguagem natural.
4. Não deverá ser utilizada qualquer biblioteca de terceiros para execução do projeto.
5. Caso tenhas alguma dúvida, tome a decisão que julgar ser a melhor e encaminhe
junto com a solução do desafio dizendo qual era sua dúvida, qual foi a decisão tomada
e defenda a posição tomada.

COMENTÁRIOS:

Analisando as considerações foi identificado um erro quando foi informado que a 00:15 o ângulo é de 45 graus, na solução do problema isso foi corrigido para 90 graus.
Para a solução do problema foi divido o relógio em 12 partes iguais por 360 graus, gerando o resultado de 30 graus para cada hora. O mesmo foi feito com os minutos, 60 dividido por 360 obtendo o resultado de 6 graus a cada minuto. Como o ponteiro das horas também avança a medida que o tempo passa, foi feita uma compensação, por exemplo, se o ponteiro dos minutos está no 30, quer dizer que o ponteiro das horas já percorreu metade do seu caminho, ou seja 15 graus 
No enunciado não é especificado se o resultado deve apresentar o menor ou maior ângulo entre os ponteiros, então foi considerado o ângulo no sentido horário, ou seja, dando uma volta completa no relógio e não a menor distância.
