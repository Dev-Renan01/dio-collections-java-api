package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/*
obterProximoEvento(): Retorna o próximo evento que ocorrerá.*/
public class AgendaEventos {
    private Map<LocalDate, Eventos> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

     public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Eventos( nome, atracao));
    }

     public void exibirAgenda(){
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(eventosMap);
        if(!eventosMap.isEmpty()){
            System.out.println(eventosTreeMap);
            } else{
            System.out.println("A agenda está vazia!");
        }
        }
        public void obterProximoEvento(){
            LocalDate dataAtual = LocalDate.now();
            LocalDate proximaData = null;
            Eventos proximoEvento = null;
            for (Map.Entry<LocalDate, Eventos> entry : eventosMap.entrySet()) {
                LocalDate dataEvento = entry.getKey();
                if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
                    proximaData = dataEvento;
                    proximoEvento = entry.getValue();
                    break;
                }
            }
            if (proximoEvento != null) {
                System.out.println("O próximo evento: " + proximoEvento.getNomeEvento() + " acontecerá na data " + proximaData);
            } else {
                System.out.println("Não há eventos futuros na agenda.");
            }
        }
   public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

       System.out.println();
         agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

         agendaEventos.exibirAgenda();

         agendaEventos.obterProximoEvento();
    }
}

