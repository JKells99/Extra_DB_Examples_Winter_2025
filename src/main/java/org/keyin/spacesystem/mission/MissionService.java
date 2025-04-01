package org.keyin.spacesystem.mission;

import java.util.logging.Logger;

public class MissionService {
    Logger log = Logger.getLogger(MissionService.class.getName());
    MissionDAO missionDAO = new MissionDAO();
    public void createMission(Mission mission) {
        if (mission.getName() == null || mission.getName().isEmpty()) {
            throw new IllegalArgumentException("Mission name cannot be null or empty");
        }
        if (mission.getStatus() == null || mission.getStatus().isEmpty()) {
            throw new IllegalArgumentException("Mission status cannot be null or empty");
        }
        if (missionDAO.getMissionByName(mission.getName())) {
            throw new IllegalArgumentException("Mission already exists");
        }

        missionDAO.createNewMission(mission);
        log.info("Mission created: " + mission.getName());
    }
}
