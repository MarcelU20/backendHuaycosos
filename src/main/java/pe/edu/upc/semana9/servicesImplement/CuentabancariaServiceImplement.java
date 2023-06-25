package pe.edu.upc.semana9.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.semana9.dtos.UsuarioCuentaDTO;
import pe.edu.upc.semana9.entities.Cuentabancaria;
import pe.edu.upc.semana9.repositories.ICuentabancariaRepository;
import pe.edu.upc.semana9.services.ICuentabancariaService;

import java.util.ArrayList;
import java.util.List;
@Service
public class CuentabancariaServiceImplement implements ICuentabancariaService {
    @Autowired
    private ICuentabancariaRepository bC;

    @Override
    public void insert(Cuentabancaria cuentabancaria) {
        bC.save(cuentabancaria);
    }

    @Override
    public List<Cuentabancaria> list() {
        return bC.findAll();
    }

    @Override
    public void delete(int idCuentabancaria) {
        bC.deleteById(idCuentabancaria);
    }

    @Override
    public Cuentabancaria listId(int idCuentabancaria) {
        return bC.findById(idCuentabancaria).orElse(new Cuentabancaria());
    }

    @Override
    public List<UsuarioCuentaDTO> reportec1() {
        List<String[]> countCuentaByUsuario = bC.getCountCuentaByUsuario();
        List<UsuarioCuentaDTO> cuentaUsuarioDTOs = new ArrayList<>();

        for (String[] data : countCuentaByUsuario) {
            UsuarioCuentaDTO dto = new UsuarioCuentaDTO();
            dto.setNombreUsuario(data[0]);
            dto.setCuentaCount(Integer.parseInt(data[1]));
            cuentaUsuarioDTOs.add(dto);
        }

        return cuentaUsuarioDTOs;
    }

    @Override
    public List<UsuarioCuentaDTO> reportec2() {
        List<String[]> maxCuentaByUsuario = bC.getMaxCuentaByUsuario();
        List<UsuarioCuentaDTO> cuentaUsuarioDTOs = new ArrayList<>();

        for (String[] data : maxCuentaByUsuario) {
            UsuarioCuentaDTO dto = new UsuarioCuentaDTO();
            dto.setNombreUsuario(data[0]);
            dto.setCuentaCount(Integer.parseInt(data[1]));
            cuentaUsuarioDTOs.add(dto);
        }

        return cuentaUsuarioDTOs;
    }
}
