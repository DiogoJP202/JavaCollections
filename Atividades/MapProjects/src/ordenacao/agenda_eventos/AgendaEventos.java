package ordenacao.agenda_eventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class AgendaEventos {
    Map<LocalDate, Evento> agendaEventos;

    public AgendaEventos(){
        agendaEventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String evento, String atracao){
        agendaEventos.put(data, new Evento(evento, atracao));
    }

    public void exibirAgenda(){
        // Organizando a nossa lista usando o treemap
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventos);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventos);
        // Pegará o evento que será hoje ou depois de hoje.
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento: " + entry.getValue() + ", acontecerá na data: " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args){
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 10), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 13), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 14), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 16), "Evento 4", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 18), "Evento 5", "Atração 5");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 28), "Evento 6", "Atração 2");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}