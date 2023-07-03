import { Box } from "@mui/material";
import React from "react";
import { Typography } from "../../atoms/Typography";
import theme from "../../../theme/theme";
import Button from "../../atoms/Button";
import Dropdown from "../../organisms/Dropdown";
import FileDownloadOutlinedIcon from "@mui/icons-material/FileDownloadOutlined";

interface PageHeaderProps {
  title: string;
  buttons?: boolean;
}

const PageHeader = (props: PageHeaderProps) => {
  return (
    <div>
      <Box
        display={"flex"}
        paddingTop={3.5}
        paddingLeft={4}
        paddingBottom={3}
        paddingRight={5}
        justifyContent={"space-between"}
      >
        <Box>
          <Typography
            variant="H1"
          >
            {props.title}
          </Typography>
        </Box>
        {props.buttons ? (
          <Box display={"flex"} gap={1}>
            <Button
              variant="outlined"
              size="small"
              sx={{
                color: theme.palette.textColor.mediumEmphasis,
                textTransform: "none",
              }}
              startIcon={<FileDownloadOutlinedIcon color="action" />}
            >
              Download report
            </Button>
            <Dropdown top="8rem" right="1rem"/>
          </Box>
        ) : (
          <></>
        )}
      </Box>
    </div>
  );
};

export default PageHeader;
