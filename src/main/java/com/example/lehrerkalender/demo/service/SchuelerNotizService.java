package com.example.lehrerkalender.demo.service;

import java.util.List;
import com.example.lehrerkalender.demo.model.SchuelerNotiz;
import com.example.lehrerkalender.demo.repository.FachRepository;
import com.example.lehrerkalender.demo.repository.SchuelerNotizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 * @class SchuelerNotizService
 */
public class SchuelerNotizService {
    @Autowired
    /**
     * @attr {@link SchuelerNotizRepository schuelerNotizRepository}
     */
    private SchuelerNotizRepository schuelerNotizRepository;

    /**
     * Liefert die Schülernotiz mit gegebener Id zurück oder eine neue, wenn sie nicht vorhanden ist
     * @param id Integer
     * @return {@link SchuelerNotiz SchuelerNotiz}
     */
    public SchuelerNotiz getSchuelerNotiz(Integer id) {
        return schuelerNotizRepository.findById(id).orElse(new SchuelerNotiz());
    }

    /**
     * Die übergebene Schülernotiz wird in der Datenbank gespeichert
     * @param schuelerNotiz {@link SchuelerNotiz SchuelerNotiz}
     * @return {@link SchuelerNotiz SchuelerNotiz}
     */
    public SchuelerNotiz addSchuelerNotiz(SchuelerNotiz schuelerNotiz) {
        return schuelerNotizRepository.save(schuelerNotiz);
    }

    /**
     * Liefert alle Schülernotizen zu einem Schüler mit der gegebenen Id zurück
     * @param schuelerId Integer
     * @return List&lt;{@link SchuelerNotiz SchuelerNotiz}&gt;
     */
    public List<SchuelerNotiz> getAllSchuelerNotizenBySchuelerId(Integer schuelerId){
        return schuelerNotizRepository.findAllBySchuelerId(schuelerId);
    }
}
